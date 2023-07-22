package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.InformationPage;
import steps.*;
import utils.configuration.ReadProperties;

public class BaseTest1 {
    protected WebDriver driver;

    protected LoginStep1 loginStep;
    protected AddCartStep1 addCartStep;
    protected CheckCartStep1 checkCartStep;
    protected AddInfoStep addInfoStep;
    protected FinishStep finishStep;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStep1(driver);
        addCartStep = new AddCartStep1(driver);
        checkCartStep = new CheckCartStep1(driver);
        addInfoStep = new AddInfoStep(driver);
        finishStep = new FinishStep(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}