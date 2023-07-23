package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import services.WaitService;

public class ContextMenuHWTest extends BaseTest {

    @Test
    public void infoAlertTest()  {
        Actions actions = new Actions(driver);
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        driver.get("http://the-internet.herokuapp.com/context_menu");

        actions
                .contextClick(contextMenuPage.getBox())
                .build()
                .perform();
        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(), "You selected a context menu");

        alert.dismiss();
    }
}

