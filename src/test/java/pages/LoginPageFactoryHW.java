package pages;

import baseEntities.BasePageHW;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactoryHW  extends BasePageHW {

    // Блок описания локаторов для элементов
    @FindBy(id = "user-name")
    public WebElement usernameInput;
    @FindBy(id = "password")
    public WebElement pswInput;
    @FindBy (id = "login-button")
    public WebElement logInButton;

    // Блок инициализации
    public LoginPageFactoryHW(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return By.id("login-button");
    }

    @Override
    protected By getPageIdentifier2() throws InterruptedException {
        return null;
    }

    @Override
    protected By getAddedCart() throws InterruptedException {
        return null;
    }

    @Override
    protected By getTitle() throws InterruptedException {
        return null;
    }

    @Override
    protected By getHeader() throws InterruptedException {
        return null;
    }

    // Блок комплексных методов
    public void login(String username, String psw) {
        usernameInput.sendKeys(username);
        pswInput.sendKeys(psw);
        logInButton.click();
    }

}