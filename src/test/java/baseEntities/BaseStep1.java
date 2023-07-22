package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.CartPage1;
import pages.ProductPage1;
import pages.LoginPage1;

public class BaseStep1 {
    protected WebDriver driver;

    protected LoginPage1 loginPage;
    protected ProductPage1 productPage;
    protected CartPage1 cartPage;

    public BaseStep1(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage1(driver);
        productPage = new ProductPage1(driver);
        cartPage = new CartPage1(driver);
    }
}