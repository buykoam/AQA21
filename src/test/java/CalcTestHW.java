import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalcTestHW {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @Test
    public void calculatorIKTTest() {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
