package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.ProductPageHW;

public class AddCartStepHW extends BaseStepHW {

    public AddCartStepHW(WebDriver driver) {
        super(driver);
    }

    public ProductPageHW successAddCart() {
        productPage.addCart();

        return productPage;
    }
}