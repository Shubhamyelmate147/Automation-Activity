

package Test;

import Demo.DemoTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends DemoTest {

    @Test
    public void testLoginFunctionality() throws InterruptedException {
        // Locate and enter username/mobile/email
        Thread.sleep(5000);


        //driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login with client ID/ email\"]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
//        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                AppiumBy.accessibilityId("Login with Client ID/ email")
//        ));

        driver.findElement(AppiumBy.accessibilityId("Login with Client ID/ email")).click();

        //loginButton.click();


        // Click on name - make this dynamic if needed
        WebElement inputField = driver.findElement(By.xpath("//android.widget.EditText")); //.click();
        inputField.click();
        // Locate the first EditText element on the screen
        //WebElement inputField = driver.findElement(By.className("android.widget.EditText"));

// Send data to that input field
        inputField.sendKeys("om namh shivay");

//        WebElement clientID = driver.findElement(AppiumBy.xpath("//android.widget.EditText"));
//
//        clientID.sendKeys("AP0111685");
//



     /*  WebElement usernameField = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Login with client ID/ email\"]"));
      usernameField.click();

      Thread.sleep(2000);
     WebElement clientID = driver.findElement(AppiumBy.xpath("//android.widget.EditText"));

     clientID.sendKeys("AP0111685"); // 🔁 Replace with actual test user

        // Tap 'Continue' or 'Next'
        WebElement continueButton = driver.findElement(By.id("//android.view.View[@content-desc=\"Proceed\"]"));
        continueButton.click();

        // Wait for OTP screen or password field to appear
        Thread.sleep(3000); // Consider using WebDriverWait instead

        // Enter password (if applicable)
        WebElement passwordField = driver.findElement(By.id("//android.widget.EditText"));
        passwordField.sendKeys("aaaa7777"); // 🔁 Replace with test password

        // Click login button
        WebElement loginButton = driver.findElement(By.id("//android.view.View[@content-desc=\"Proceed\"]"));
        loginButton.click();

        // Wait for dashboard/home to load
        Thread.sleep(5000);


        // Step 5: Enter 4-digit PIN (Assuming keypad digits are buttons with text or IDs)
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"9\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"9\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"9\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"9\"]")).click();

        Thread.sleep(3000); // Wait for dashboard to load

     WebElement dashboardPopup = driver.findElement(AppiumBy.accessibilityId("//android.view.View[@content-desc=\"I Understand\"]"));
     Assert.assertTrue(dashboardPopup.isDisplayed(), "❌ Login failed: Dashboard not visible");

     // Optionally click "I Understand" if required
     dashboardPopup.click();

     System.out.println("✅ Login and PIN entry successful.");
    }*/
    }
}