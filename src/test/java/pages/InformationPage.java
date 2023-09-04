package pages;

import baseEntities.BasePage;
import models.Info;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPage extends BasePage {

    // Блок описания локаторов для элементов
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By codeInputLocator = By.id("postal-code");
    private final By checkButtonLocator = By.id("continue");
    private final By titleLocator=  By.xpath("//div[text() = 'Swag Labs']");

    // Блок инициализации
    public InformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return titleLocator;
    }

    // Блок атомарных методов
    public WebElement getFirstNameInput() {
        return driver.findElement(firstNameInputLocator);
    }

    public WebElement getLastNameInput() {
        return driver.findElement(lastNameInputLocator);
    }

    public WebElement getCode() {
        return driver.findElement(codeInputLocator);
    }
    public WebElement getCheck() {
        return driver.findElement(checkButtonLocator);
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
    public void addInfo(Info info) {
        setFirstName(info.getFirstname());
        setLastName(info.getLastname());
        setCode(info.getCode());
        getCheck().click();
    }
}