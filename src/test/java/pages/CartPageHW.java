package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageHW extends BasePageHW {

    // Блок описания локаторов для элементов
    private final By checkoutIdLocator = By.id("checkout");
    private final By getPageIdentifier2 = By.className("checkout_info");

    // Блок инициализации
    public CartPageHW(WebDriver driver) {
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

    @Override
    protected By getTitle() throws InterruptedException {
        return null;
    }

    @Override
    protected By getHeader() throws InterruptedException {
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