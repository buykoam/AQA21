package pages;

import baseEntities.BasePageHW;
import models.InfoBuyer;
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
    public InformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
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
        return titleLocator;
    }

    @Override
    protected By getHeader() throws InterruptedException {
        return null;
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
    public void addInfo(InfoBuyer InfoBuyer) {
        getFirstNameInput().sendKeys(InfoBuyer.getFirstName());
        getLastNameInput().sendKeys(InfoBuyer.getLastName());
        getCode().sendKeys(InfoBuyer.getCode());
        getCheck().click();
    }
}