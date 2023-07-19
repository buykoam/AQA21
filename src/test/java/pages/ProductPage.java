package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    private final static String pagePath = "/inventory.html/";

    // Блок описания локаторов для элементов

    private final By headerTitleLabelLocator = By.xpath("//div[text() = 'Swag Labs']");
    private final By removeButtonLocator= By.xpath("//div[text() = 'Remove']");
    private final By productIdLocator = By.id("item_0_title_link");
    private final By addButtonLocator = By.id("add-to-cart-sauce-labs-bike-light");

    // Блок инициализации
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() throws InterruptedException {
        Thread.sleep(2000);
        return headerTitleLabelLocator;
    }

    @Override
    protected By getAddedCart() throws InterruptedException {
        Thread.sleep(2000);
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
    // Блок комплексных методов
    public void addCart() {
        getProductInput().click();
        getAddButtonInput().click();
    }




}