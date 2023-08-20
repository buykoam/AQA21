package pages;

import baseEntities.BasePageHW;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ProductPageHW extends BasePageHW {
    private final static String pagePath = "/inventory.html/";

    // Блок описания локаторов для элементов

    private final By headerTitleLabelLocator = By.xpath("//div[text() = 'Swag Labs']");
    private final By removeButtonLocator= By.xpath("//div[text() = 'Sauce Labs Bike Light']");
    private final By productIdLocator = By.id("item_0_title_link");
    private final By addButtonLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By shoppingIdLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public ProductPageHW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        sleep(2000);
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }
    // Блок атомарных методов
    public SelenideElement getHeaderTitle() {
        return $(headerTitleLabelLocator);
    }

    // Блок атомарных методов
    public SelenideElement  getProductInput() {
        return $(productIdLocator);
    }

    public SelenideElement  getAddButtonInput() {
        return $(addButtonLocator);
    }
    public SelenideElement getShoppingId() {
        return $(shoppingIdLocator);
    }
    // Блок комплексных методов
    public void addCart() {
        getProductInput().click();
        getAddButtonInput().click();
        getShoppingId().click();
    }




}