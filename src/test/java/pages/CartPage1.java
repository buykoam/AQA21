package pages;

import baseEntities.BasePage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage1 extends BasePage1 {

    // Блок описания локаторов для элементов
    private final By checkoutIdLocator = By.id("checkout");
    private final By getPageIdentifier2 = By.className("checkout_info");

    // Блок инициализации
    public CartPage1(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() throws InterruptedException {
        return getPageIdentifier2;
    }

    @Override
    protected By getPageIdentifier2() throws InterruptedException {
        return getPageIdentifier2;
    }

    @Override
    protected By getAddedCart() throws InterruptedException {
        return null;
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
