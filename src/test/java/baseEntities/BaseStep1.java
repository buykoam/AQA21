package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep1 {
    protected WebDriver driver;

    protected LoginPage1 loginPage;
    protected ProductPage1 productPage;
    protected CartPage1 cartPage;
    protected InformationPage infoPage;
    protected CompletePage completePage;

    public BaseStep1(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage1(driver);
        productPage = new ProductPage1(driver);
        cartPage = new CartPage1(driver);
        infoPage = new InformationPage(driver);
        completePage = new CompletePage(driver);
    }
}