package steps;

import baseEntities.BaseStep1;
import org.openqa.selenium.WebDriver;
import pages.ProductPage1;

public class LoginStep1 extends BaseStep1 {

    public LoginStep1(WebDriver driver) {
        super(driver);
    }

    public ProductPage1 successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return productPage;
    }

}