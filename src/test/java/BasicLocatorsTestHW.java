import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;
public class BasicLocatorsTestHW {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void basicLocatorsTest_1() {
        driver.get(ReadProperties.getUrl1());

        // Find webElement by ID
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username1());

        // Find webElement by Name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password1());

        // Find webElement by ClassName
        driver.findElement(By.className("submit-button")).click();
    }
    @Test
    public void basicLocatorsTest_2() throws InterruptedException {
        driver.get(ReadProperties.getUrl1());

        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username1());

        driver.findElement(By.name("password")).sendKeys(ReadProperties.password1());

        driver.findElement(By.className("submit-button")).click();

        //Find element by LinkText
        driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
        Thread.sleep(3000);

        //Find element by PartialLinkText
        driver.findElement(By.partialLinkText("Back")).click();
    }
}
