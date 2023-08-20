package pages;

import baseEntities.BasePageHW;
import com.codeborne.selenide.WebDriverRunner;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPage extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By codeInputLocator = By.id("postal-code");
    private final By checkButtonLocator = By.id("continue");
    private final By titleLocator= By.xpath("//div[text() = 'Payment Information']");

    // Блок инициализации
    public InformationPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    // Блок атомарных методов
    public UIElement getFirstNameInput() {
        return new UIElement(WebDriverRunner.getWebDriver(),firstNameInputLocator);
    }

    public  UIElement getLastNameInput() {
        return new UIElement(WebDriverRunner.getWebDriver(),lastNameInputLocator);
    }

    public  UIElement getCode() {
        return new UIElement(WebDriverRunner.getWebDriver(),codeInputLocator);
    }
    public  UIElement getCheck() {
        return new UIElement(WebDriverRunner.getWebDriver(),checkButtonLocator);
    }

    public void setFirstName(String value) {
        getFirstNameInput().sendKeys(value);
    }
    public void setLastName(String value) {
        getLastNameInput().sendKeys(value);
    }
    public void setCode(String value) {
        getCode().sendKeys(value);
    }

    // Блок комплексных методов
    public void addInfo(String firstname, String lastname, String code) {
        getFirstNameInput().sendKeys(firstname);
        getLastNameInput().sendKeys(lastname);
        getCode().sendKeys(code);
        getCheck().click();
    }
}