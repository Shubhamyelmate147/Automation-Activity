
package Demo;

import Pages.SearchPage;
import Utils.ScreenshotUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DemoTest {

  protected AndroidDriver driver;

  @Test
  public void setUp() throws MalformedURLException, InterruptedException {

    UiAutomator2Options options = new UiAutomator2Options();
    options.setDeviceName("OnePlus CPH2467");
    options.setPlatformName("Android");
    options.setAutomationName("UiAutomator2");
    options.setUdid("bc20b511");
    options.setApp("C:\\Users\\ARIHANT\\Desktop\\Appium\\ACML UAT 1.0.336.apk");
    options.setCapability("autoGrantPermissions", true);
    options.setNoReset(true);

    driver = new AndroidDriver(new URL("http://192.168.80.142:4723"), options);
    System.out.println("App Launched Successfully");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
    WebElement loginOption = wait.until(
            ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Login with client ID/ email")));
    loginOption.click();
    Thread.sleep(2000);
    WebElement inputField = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.className("android.widget.EditText")));
    inputField.click();
    inputField.sendKeys("AP0111685");

    WebElement continueButton = wait.until(
            ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Proceed")));
    continueButton.click();

    Thread.sleep(2000);
    //===

    WebElement passwordField = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.className("android.widget.EditText")));
    passwordField.click();
    passwordField.sendKeys("aaaa1111");

    WebElement loginButton = wait.until(
            ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Proceed")));
    loginButton.click();

    //=========
    Thread.sleep(1000);
    WebElement pinField = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.className("android.widget.EditText")));
    pinField.click();
    pinField.sendKeys("1111");
    System.out.println("✅ Login and PIN entry successful.");

//
    //Post login flows
    Thread.sleep(1000);
    WebElement understand = wait.until(
            ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("I Understand")));
    understand.click();

    Thread.sleep(1000);
    SearchPage searchPage = new SearchPage(driver);
    searchPage.searchAndBuyYesBank("1");
    System.out.println("✅ YESBANK Buy flow completed successfully.");


//    Thread.sleep(1000);
//    WebElement YV = wait.until(
//            ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("YV")));
//    YV.click();
//
//    //Bank Accounts
//    Thread.sleep(3100);
//    WebElement BankAccounts = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Bank Accounts\n" + "Bank details\"]")));
//    BankAccounts.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "bank_account_screen");
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//android.view.View[@content-desc='Bank Accounts']/android.widget.ImageView")).click();
//
//    //IPOs
//    Thread.sleep(3000);
//    WebElement IPO = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"IPOs/NCDs\n" + "Invest online in IPOs/NCDs\"]")));
//    IPO.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "IPO_screen");
//    Thread.sleep(1000);
//    driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView")).click();
//
//
//    //Research Calls
//    Thread.sleep(2000);
//    WebElement ResearchCalls = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Research Calls\n" + "Research stock ideas from experts\"]")));
//    ResearchCalls.click();
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//android.view.View[@content-desc=\"Continue\"]")).click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "research_calls_screen");
//    driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView")).click();
//
//  /*  driver.findElement(AppiumBy.androidUIAutomator(
//            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
//                    + "new UiSelector().descriptionContains(\"Smart Reports\"));"
//    ));
//
//    Thread.sleep(2000);
//    WebElement SmartReports = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Smart Reports\n" + "Your trading reports\"]")));
//    SmartReports.click();
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//android.widget.ImageView")).click();*/
//
//    driver.findElement(AppiumBy.androidUIAutomator(
//            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
//                    + "new UiSelector().descriptionContains(\"My Alerts\"));"
//    ));
//
//    Thread.sleep(2000);
//    WebElement MyAlerts = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"My Alerts\n" + "Manage Alerts\"]")));
//    MyAlerts.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "my_alerts_screen");
//    Thread.sleep(1000);
//    driver.findElement(By.xpath("//android.view.View[@content-desc=\"My Alerts\"]/android.view.View[1]/android.widget.ImageView")).click();
//
//
//    Thread.sleep(3000);
//    WebElement Notification = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")));
//    Notification.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "notification_screen");
//    Thread.sleep(2000);
//    driver.navigate().back();
//    //driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Notifications\"]")).click();
//
//    Thread.sleep(1000);
//    WebElement CloseIcon = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")));
//    CloseIcon.click();
//
//    Thread.sleep(2000);
//    WebElement Watchlist = wait.until(
//            ExpectedConditions.elementToBeClickable(
//                    By.xpath("//android.view.View[contains(@content-desc, 'Watchlist')]")
//            )
//    );
//    Watchlist.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "Watchlist_screen");
//
//
//    Thread.sleep(2000);
//    WebElement Markets = wait.until(
//            ExpectedConditions.elementToBeClickable(
//                    By.xpath("//android.view.View[contains(@content-desc, 'Markets')]")
//            )
//    );
//    Markets.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "Markets_screen");
//
//    Thread.sleep(2000);
//    WebElement Scanners = wait.until(
//            ExpectedConditions.elementToBeClickable(
//                    By.xpath("//android.view.View[contains(@content-desc, 'Scanners')]")
//            )
//    );
//    Scanners.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "Scanners_screen");
//
//    WebElement Ok = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Ok, Got it\"]")));
//    Ok.click();
//
//    Thread.sleep(2000);
//    WebElement Trades = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Trades\"]")));
//    Trades.click();
//
//    Thread.sleep(2000);
//    WebElement Holdings = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Trades\"]")));
//    Holdings.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "Holdings_screen");
//
//    Thread.sleep(2000);
//    WebElement Positions = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Positions\n" + "Tab 2 of 3\"]")));
//    Positions.click();
//    Thread.sleep(1000);
//    ScreenshotUtil.takeScreenshot(driver, "Positions_screen");

//    Thread.sleep(1000);
//    SearchPage searchPage = new SearchPage(driver);
//    searchPage.searchAndBuyYesBank("1");
//    System.out.println("✅ YESBANK Buy flow completed successfully.");

//
  }
}



