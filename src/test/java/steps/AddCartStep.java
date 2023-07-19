package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ProductPage;

public class AddCartStep extends BaseStep {

    public AddCartStep(WebDriver driver) {
        super(driver);
    }

    public ProductPage successAddCart() {
        productPage.addCart();

        return productPage;
    }
}
