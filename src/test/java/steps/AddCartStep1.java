package steps;

import baseEntities.BaseStep1;
import org.openqa.selenium.WebDriver;
import pages.ProductPage1;

public class AddCartStep1 extends BaseStep1 {

    public AddCartStep1(WebDriver driver) {
        super(driver);
    }

    public ProductPage1 successAddCart() {
        productPage.addCart();

        return productPage;
    }
}
