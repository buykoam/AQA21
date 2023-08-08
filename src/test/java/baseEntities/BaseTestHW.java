package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.*;
import utils.configuration.ReadPropertiesHW;

public class BaseTestHW {
    protected WebDriver driver;

    protected LoginStepHW loginStep;
    protected LoginStepHW2 loginStep2;
    protected AddCartStepHW addCartStep;
    protected CheckCartStepHW checkCartStep;
    protected AddInfoStep addInfoStep;
    protected FinishStep finishStep;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStepHW(driver);
        loginStep2 = new LoginStepHW2(driver);
        addCartStep = new AddCartStepHW(driver);
        checkCartStep = new CheckCartStepHW(driver);
        addInfoStep = new AddInfoStep(driver);
        finishStep = new FinishStep(driver);
        driver.get(ReadPropertiesHW.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}