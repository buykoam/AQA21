package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageHW extends BasePageHW {
    private final static String pagePath = "/inventory.html/";

    // Блок описания локаторов для элементов

    private final By headerTitleLabelLocator = By.xpath("//div[text() = 'Swag Labs']");
    private final By removeButtonLocator= By.xpath("//div[text() = 'Sauce Labs Bike Light']");
    private final By productIdLocator = By.id("item_0_title_link");
    private final By addButtonLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By shoppingIdLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public ProductPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() throws InterruptedException {
        Thread.sleep(2000);
        return headerTitleLabelLocator;
    }

    @Override
    protected By getPageIdentifier2() throws InterruptedException {
        return null;
    }

    @Override
    protected By getAddedCart() throws InterruptedException {
        return removeButtonLocator;
    }

    @Override
    protected By getTitle() throws InterruptedException {
        return null;
    }

    @Override
    protected By getHeader() throws InterruptedException {
        return null;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }
    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLabelLocator);
    }

    // Блок атомарных методов
    public WebElement getProductInput() {
        return driver.findElement(productIdLocator);
    }

    public WebElement getAddButtonInput() {
        return driver.findElement(addButtonLocator);
    }
    public WebElement getShoppingId() {
        return driver.findElement(shoppingIdLocator);
    }
    // Блок комплексных методов
    public void addCart() {
        getProductInput().click();
        getAddButtonInput().click();
        getShoppingId().click();
    }




}