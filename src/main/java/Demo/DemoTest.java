
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
      options.setUdid("bc20b511");
      //options.setApp("C:\\Users\\ARIHANT\\Desktop\\Appium\\ACML UAT 1.0.336.apk");
      options.setCapability("autoGrantPermissions", true);
      options.setNoReset(true);


      driver = new AndroidDriver(new URL("http://192.168.80.142:4723"), options);
      System.out.println("App Launched Successfully");

      String appPackage = "com.msf.acml.uat"; // your app package name

      if (driver.isAppInstalled(appPackage)) {
          System.out.println("✅ App already installed, launching it...");
          driver.activateApp(appPackage);
          enterPin("1111");
      } else {
          System.out.println("❌ App not installed, installing it...");
          driver.installApp("C:\\Users\\ARIHANT\\Desktop\\Appium\\ACML UAT 1.0.336.apk");
          driver.activateApp(appPackage);
      }


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
//      Thread.sleep(1000);
//      WebElement pinField = wait.until(
//              ExpectedConditions.presenceOfElementLocated(By.className("android.widget.EditText")));
//      pinField.click();
//      pinField.sendKeys("1111");

      enterPin("1111");

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
    Thread.sleep(1000);
    driver.findElement(By.xpath("//android.view.View[@content-desc='Bank Accounts']/android.widget.ImageView")).click();

    Thread.sleep(2000);
    WebElement  IPO = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"IPOs/NCDs\n" +
                    "Invest online in IPOs/NCDs\"]")));
    IPO.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView")).click();


    Thread.sleep(2000);
    WebElement ResearchCalls = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Research Calls\n" +
                    "Research stock ideas from experts\"]")));
    ResearchCalls.click();
    Thread.sleep(4000);
      driver.findElement(By.xpath("//android.view.View[@content-desc=\"Continue\"]")).click();
      driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView")).click();

    Thread.sleep(2000);
      WebElement SmartReports = wait.until(
              ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Smart Reports\n" + "Your trading reports\"]")));
      SmartReports.click();

      Thread.sleep(2000);
      WebElement MyAlerts = wait.until(
              ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"My Alerts\n" + "Manage Alerts\"]")));
      MyAlerts.click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//android.view.View[@content-desc=\"My Alerts\"]/android.view.View[1]/android.widget.ImageView")).click();

      Thread.sleep(2000);
      WebElement Notification = wait.until(
              ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")));
      Notification.click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Notifications\"]")).click();
  }

    public void enterPin(String pin) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement pinField = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.className("android.widget.EditText")));
        pinField.click();
        pinField.sendKeys(pin);
        System.out.println("✅ PIN entered successfully.");
    }
}


