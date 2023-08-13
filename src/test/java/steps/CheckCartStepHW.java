package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CartPageHW;

public class CheckCartStepHW extends BaseStepHW {

    public CheckCartStepHW(WebDriver driver) {
        super(driver);
    }

    public CartPageHW successCheckCart() {
        cartPage.checkCart();
        return cartPage;
    }
}