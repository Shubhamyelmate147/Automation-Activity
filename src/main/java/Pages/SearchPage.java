package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SearchPage {
    AndroidDriver driver;
    WebDriverWait wait;

    public SearchPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void closeProfile() {
        WebElement closeIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView")));
        closeIcon.click();
    }

    public void openWatchlist() {
        WebElement watchlistTab = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.widget.ImageView[@content-desc='Watchlist']")));
        watchlistTab.click();
    }

    public void openExploreTab() {
        WebElement exploreTab = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.widget.ImageView[@content-desc='Explore']")));
        exploreTab.click();

        try {
            Thread.sleep(800); // much faster than 3s!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void searchStock(String stockName) {
        WebElement searchInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.className("andbuyButton.click(roid.widget.EditText")));
        searchInput.sendKeys(stockName);

        try {
            Thread.sleep(3000); // Use explicit wait later
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectYesBankStock() {
        WebElement yesBankOption = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.view.View[contains(@content-desc, 'YESBANK-EQ')]")));
        yesBankOption.click();
    }

    public void clickBuyButton() {
        WebElement buyBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.view.View[@content-desc='Buy']")));
        buyBtn.click();
    }

    public void enterQuantity(String quantity) {
        WebElement qtyInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.widget.EditText[@text='1']")));
        qtyInput.clear();
        qtyInput.sendKeys(quantity);
    }

    public void clickFinalBuyButton() {
        WebElement finalBuyBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("(//android.view.View[@content-desc='Buy'])[2]")));
        finalBuyBtn.click();
    }

    public void clickDoneButton() {
        WebElement doneBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.view.View[@content-desc='Done']")));
        doneBtn.click();
    }

    // 🌟 NEW: Combined YES BANK flow method
    public void searchAndBuyYesBank(String quantity) throws InterruptedException {
        // 1. Open Explore tab
        WebElement exploreTab = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.ImageView[@content-desc='Explore']")));
        exploreTab.click();

        Thread.sleep(1500); // wait for animation

        // 2. Tap search box and type YES BANK
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(
                By.className("android.widget.EditText")));
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys("YES BANK");

        Thread.sleep(1500); // wait for results

        // 3. Click YES BANK stock option
        WebElement yesBankOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.View[contains(@content-desc, 'YESBANK-EQ')]")));
        yesBankOption.click();

        Thread.sleep(1500); // wait for stock details

        // 4. Click Buy button
        WebElement buyBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.View[@content-desc='Buy']")));
        buyBtn.click();

        // 5. Enter quantity
        WebElement qtyInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.className("android.widget.EditText")));
        qtyInput.click();
        qtyInput.clear(); // optionalplaceOrderBtn.click
        qtyInput.sendKeys("1");

        // 6. Click final Buy
        WebElement finalBuyBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//android.view.View[@content-desc='Buy'])[2]")));
        finalBuyBtn.click();

        // 7. Click Done
        WebElement doneBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.view.View[@content-desc='Done']")));
        doneBtn.click();

        Thread.sleep(1500);
        WebElement BackButton1 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[1]")));
        BackButton1.click();

        WebElement BackButton2 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView")));
        BackButton2.click();


    }
}
