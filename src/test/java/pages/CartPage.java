package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    private final static String pagePath = "/cart.html/";

    // Блок описания локаторов для элементов
    private final By checkoutIdLocator = By.id("checkout");
    private final By getPageIdentifier2 = By.xpath("//div[text() = 'Swag Labs']");

    // Блок инициализации
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return getPageIdentifier2;
    }

    // Блок атомарных методов

    public WebElement getCheckoutId() {
        return driver.findElement(checkoutIdLocator);
    }

    // Блок комплексных методов
    public void checkCart() {
        getCheckoutId().click();
    }

}