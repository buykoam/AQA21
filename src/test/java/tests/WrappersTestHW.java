package tests;

import baseEntities.BaseTest;
import elements.DropDown;
import elements.RadioButton;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EditProjectPage;
import pages.AddProjectPage;
import utils.configuration.ReadProperties;

public class WrappersTestHW extends BaseTest {
    @Test
    public void checkboxTest() {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );
        EditProjectPage editProjectPage = new EditProjectPage(driver);
        editProjectPage.openPageByUrl();
    }

    private void setCheckBox(WebElement webElement) throws InterruptedException {
        if (setCheckBox(true)) {
            webElement.click();
        }
    }

    private void removeCheckBox(WebElement webElement) throws InterruptedException {
        if (!webElement.isSelected()) {
            webElement.click();
        }

        WebElement el1 = driver.findElement(By.cssSelector("class1")).findElement(By.cssSelector("class2"));
        WebElement el2 = webElement.findElement(By.cssSelector("class1")).findElement(By.cssSelector("class2"));
    }

    @Test
    public void radiobuttonTest() {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );
    }

    private void setRadiobutton(WebElement webElement) throws InterruptedException {
        EditProjectPage editProjectPage = new EditProjectPage(driver);
        editProjectPage.openPageByUrl();
        RadioButton radioButtons = editProjectPage.getRadioButtonTable();
        UIElement radioButton = radioButtons.getRadioButton(3);
        radioButton.click();

        Assert.assertTrue(radioButtons.isRadioButtonClick(radioButton));
    }



    @Test
    public void dropdownTest() {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );
        AddProjectPage addProjectPage = new  AddProjectPage(driver);
        addProjectPage.openPageByUrl();
        addProjectPage.dropdown();
        addProjectPage.textDropDown();
    }

}
