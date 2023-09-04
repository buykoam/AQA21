package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage extends BasePage {

    // Блок описания локаторов для элементов
    private final By finishButtonLocator = By.id("finish");
    private final By completeHeader= By.xpath("//div[text() = 'Swag Labs']");

    // Блок инициализации
    public CompletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return completeHeader;
    }


    // Блок атомарных методов
    public WebElement getFinishButton() {
        return driver.findElement( finishButtonLocator);
    }

    // Блок комплексных методов
    public void getComplete() {
        getFinishButton().click();
    }
}