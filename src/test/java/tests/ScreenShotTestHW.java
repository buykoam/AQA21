package tests;

import baseEntities.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenShotTestHW extends BaseTest {
    @Test
    @Story("AQA21-2678")
    @Description("Test without waitService")
    @Severity(SeverityLevel.CRITICAL)
    public void confirmAlertTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[. = 'Click for JS Confirm']")).click();

        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(), "I am a Java Confirm");

        alert.dismiss();
    }
}
