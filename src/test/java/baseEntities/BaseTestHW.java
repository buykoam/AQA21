package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.InformationPage;
import steps.*;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver driver;

    protected LoginStepHW loginStep;
    protected AddCartStepHW addCartStep;
    protected CheckCartStepHW checkCartStep;
    protected AddInfoStep addInfoStep;
    protected FinishStep finishStep;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStepHW(driver);
        addCartStep = new AddCartStepHW(driver);
        checkCartStep = new CheckCartStepHW(driver);
        addInfoStep = new AddInfoStep(driver);
        finishStep = new FinishStep(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}