package tests;

import baseEntities.BaseTest;
import io.qameta.allure.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

@Epic("Alert")
@Feature("WaitService")
public class AlertTests extends BaseTest {

    @Test
    @Story("AQA21-2677")
    @Description("Test without waitService")
    @Severity(SeverityLevel.BLOCKER)
    public void infoAlertTest() {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[. = 'Click for JS Alert']")).click();

        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(), "I am a JS Alert");

        alert.accept();
    }

    @Test
    @Story("AQA21-2678")
    @Description("Test without waitService")
    @Severity(SeverityLevel.CRITICAL)
    public void confirmAlertTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[. = 'Click for JS Confirm']")).click();

        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(), "I am a JS Confirm");

        alert.dismiss();
    }

    @Test
    @Story("AQA21-2679")
    @Description("Test with waitService")
    @Severity(SeverityLevel.NORMAL)
    public void promptAlertTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WaitService waitService = new WaitService(driver);
        driver.findElement(By.xpath("//button[. = 'Click for JS Prompt']")).click();


        Alert alert = driver.switchTo().alert();


        Assert.assertEquals(alert.getText(), "I am a JS prompt");

        alert.sendKeys("Everything is OK!");
        alert.accept();

        //Thread.sleep(5000);
    }
}