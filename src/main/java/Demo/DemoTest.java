
package Demo;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
//import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
      options.setNoReset(true);
      options.setUdid("bc20b511");
      options.setApp("C:\\Users\\ARIHANT\\Desktop\\Appium\\ACML UAT 1.0.336.apk");

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

      //===========
      Thread.sleep(1000);
      WebElement pinField = wait.until(
              ExpectedConditions.presenceOfElementLocated(By.className("android.widget.EditText")));
      pinField.click();
      pinField.sendKeys("1111");

      System.out.println("✅ Login and PIN entry successful.");



      WebElement  understand = wait.until(
              ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("I Understand")));
      understand.click();

    Thread.sleep(1000);
    WebElement  YV = wait.until(
            ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("YV")));
    YV.click();

    Thread.sleep(2000);
    WebElement  BankAccounts = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Bank Accounts\n" +
                    "Bank details\"]")));
    BankAccounts.click();
    //    Testing git push and pull
    //the write Ipo
  }
}


