package pages;

import baseEntities.BasePage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage1 extends BasePage1 {
    private final static String pagePath = "/inventory.html/";

    // Блок описания локаторов для элементов

    private final By headerTitleLabelLocator = By.xpath("//div[text() = 'Swag Labs']");
    private final By removeButtonLocator= By.xpath("//div[text() = 'Sauce Labs Bike Light']");
    private final By productIdLocator = By.id("item_0_title_link");
    private final By addButtonLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By shoppingIdLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public ProductPage1(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() throws InterruptedException {
        Thread.sleep(2000);
        return headerTitleLabelLocator;
    }

    @Override
    protected By getAddedCart() throws InterruptedException {
        return removeButtonLocator;
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