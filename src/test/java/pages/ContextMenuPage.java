package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContextMenuPage extends BasePage {

    // Блок описания локаторов для элементов
    private final By boxIdLocator = By.id("hot-spot");

    // Блок инициализации
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return boxIdLocator;
    }
    // Блок атомарных методов
    public WebElement getBox() {
        return waitService.waitForVisibilityLocatedBy(boxIdLocator);
    }
}
