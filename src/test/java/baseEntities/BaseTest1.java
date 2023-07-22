package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.AddCartStep1;
import steps.CheckCartStep1;
import steps.LoginStep1;
import utils.configuration.ReadProperties;

public class BaseTest1 {
    protected WebDriver driver;

    protected LoginStep1 loginStep;
    protected AddCartStep1 addCartStep;
    protected CheckCartStep1 checkCartStep;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStep1(driver);
        addCartStep = new AddCartStep1(driver);
        checkCartStep = new CheckCartStep1(driver);
        driver.get(ReadProperties.getUrl());
    }

//    @AfterMethod
 //   public void tearDown() {
//        driver.quit();
//    }

}