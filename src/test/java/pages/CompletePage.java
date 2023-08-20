package pages;

import baseEntities.BasePageHW;
import baseEntities.BasePageHW;
import com.codeborne.selenide.WebDriverRunner;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By finishButtonLocator = By.id("finish");
    private final By completeHeader= By.xpath("//div[text() = 'Your order has been dispatched, and will arrive just as fast as the pony can get there!']");

    // Блок инициализации
    public CompletePage() {
        super();
    }

    @Override
    protected By getPageIdentifier()  {
        return null;
    }

    // Блок атомарных методов
    public UIElement getFinishButton() {
        return new UIElement(WebDriverRunner.getWebDriver(), finishButtonLocator);
    }

    // Блок комплексных методов
    public void getComplete() {
        getFinishButton().click();
    }
}