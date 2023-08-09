package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStepHW {
    protected WebDriver driver;

    protected LoginPageHW loginPage;
    protected LoginPageFactoryHW loginPageFactoryHW;
    protected ProductPageHW productPage;
    protected CartPageHW cartPage;
    protected InformationPage infoPage;
    protected CompletePage completePage;

    public BaseStepHW(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPageHW(driver);
        loginPageFactoryHW = new LoginPageFactoryHW(driver);
        productPage = new ProductPageHW(driver);
        cartPage = new CartPageHW(driver);
        infoPage = new InformationPage(driver);
        completePage = new CompletePage(driver);
    }
}