package pages;

import baseEntities.BasePageHW;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By usernameInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");

    // Блок инициализации
    public LoginPageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return logInButtonLocator;
    }


    // Блок атомарных методов
    public SelenideElement getUsernameInput() {
        return $(usernameInputLocator);
    }

    public SelenideElement getPswInput() {
        return $(pswInputLocator);
    }

    public SelenideElement getLogInButton() {
        return $(logInButtonLocator);
    }

    public void setEmail(String value) {
        getUsernameInput().sendKeys(value);
    }

    // Блок комплексных методов
    public void login(String username, String password) {
        getUsernameInput().sendKeys(username);
        getPswInput().sendKeys(password);
        getLogInButton().click();
    }

}