package Test;

import Demo.DemoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTest extends DemoTest {

    @Test
    public void testProfileDataVisible() throws InterruptedException {
        // Tap profile icon (Update XPaths/IDs as per your app)
        WebElement profileIcon = driver.findElement(By.xpath("//android.view.View[@content-desc=\"N\"]"));
        profileIcon.click();

        WebElement profileItem = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Nishant\"]"));
        profileItem.click();

        Thread.sleep(2000); // Replace with explicit wait if needed

        // Verify profile name
     /*   WebElement profileName = driver.findElement(By.id("com.arihant.mobile:id/profile_name"));
        Assert.assertTrue(profileName.isDisplayed(), "❌ Profile name not visible");

        // Verify profile email
        WebElement profileEmail = driver.findElement(By.id("com.arihant.mobile:id/profile_email"));
        Assert.assertTrue(profileEmail.isDisplayed(), "❌ Profile email not visible");

        System.out.println("✅ Profile details are visible");*/

        // Optional: go back
        driver.navigate().back();
    }
}
