package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.ProductPageHW;

public class AddCartStepHW extends BaseStepHW {

    public AddCartStepHW() {
        super();
    }

    public ProductPageHW successAddCart() {
        productPage.addCart();

        return productPage;
    }
}