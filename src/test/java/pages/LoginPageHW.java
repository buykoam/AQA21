package pages;

import baseEntities.BasePageHW;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By usernameInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");

    // Блок инициализации
    public LoginPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return logInButtonLocator;
    }

    @Override
    protected By getPageIdentifier2() throws InterruptedException {
        return null;
    }

    @Override
    protected By getAddedCart() throws InterruptedException {
        return logInButtonLocator;
    }

    @Override
    protected By getTitle() throws InterruptedException {
        return null;
    }

    @Override
    protected By getHeader() throws InterruptedException {
        return null;
    }

    // Блок атомарных методов
    public WebElement getUsernameInput() {
        return driver.findElement(usernameInputLocator);
    }

    public WebElement getPswInput() {
        return driver.findElement(pswInputLocator);
    }

    public WebElement getLogInButton() {
        return driver.findElement(logInButtonLocator);
    }


    // Блок комплексных методов
    public void login(User user) {
        getUsernameInput().sendKeys(user.getUsername());
        getPswInput().sendKeys(user.getPassword());
        getLogInButton().click();
    }

}