package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.ProductPage;
import pages.LoginPage;

public class BaseStep {
    protected WebDriver driver;

    protected LoginPage loginPage;
    protected ProductPage productPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
    }
}