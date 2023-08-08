package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import steps.LoginStep;
import utils.InvokedListener;
import utils.configuration.ReadPropertiesHW;

@Listeners(InvokedListener.class)
public class BaseTest {
    protected WebDriver driver;

    protected LoginStep loginStep;

    @BeforeMethod
    public void setUp(ITestContext iTestContext) {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStep(driver);

        driver.get(ReadPropertiesHW.getUrl());
    }
    public static void setDriverToContext(ITestContext iTestContext, WebDriver driver){
        iTestContext.setAttribute("WebDriver", driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            System.out.println("Make screenshot");
        }
        driver.quit();
    }

}