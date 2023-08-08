package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.ProductPageHW;

public class LoginStepHW2 extends BaseStepHW {

    public LoginStepHW2(WebDriver driver) {
        super(driver);
    }

    public ProductPageHW successLogin(String username, String psw) {
        loginPageFactoryHW.login(username, psw);

        return productPage;
    }

}
