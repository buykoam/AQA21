package pages;

import baseEntities.BasePageHW;
import com.codeborne.selenide.WebDriverRunner;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPageHW extends BasePageHW {
    private final static String pagePath = "/cart.html";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'title') and contains(text(), 'Your Cart')]");
    private final By checkoutIdLocator = By.id("checkout");
    private final By getPageIdentifier2 = By.className("checkout_info");

    // Блок инициализации
    public CartPageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    // Блок атомарных методов

    public WebElement getHeaderTitle() {
        return $(headerTitleLabelLocator);
    }
    public UIElement getCheckoutId() {
        return new UIElement(WebDriverRunner.getWebDriver(), checkoutIdLocator);
    }

    // Блок комплексных методов
    public void checkCart() {
        getCheckoutId().click();
    }

}