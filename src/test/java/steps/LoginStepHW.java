package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.ProductPageHW;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW() {
        super();
    }

    public ProductPageHW successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return productPage;
    }

}