package steps;

import baseEntities.BaseStepHW;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.ProductPageHW;

public class LoginStepHW extends BaseStepHW {

    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public ProductPageHW successLogin(User user) {
        loginPage.login(user);

        return productPage;
    }

}