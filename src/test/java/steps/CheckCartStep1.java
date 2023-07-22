package steps;

import baseEntities.BaseStep1;
import org.openqa.selenium.WebDriver;
import pages.CartPage1;

public class CheckCartStep1 extends BaseStep1 {

    public CheckCartStep1(WebDriver driver) {
        super(driver);
    }

    public CartPage1 successCheckCart() {
        cartPage.checkCart();
        return cartPage;
    }
}
