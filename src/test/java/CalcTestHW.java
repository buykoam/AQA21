import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
    public void calculatorIKTTest() throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WebElement widthInput = driver.findElement(By.id("el_f_width"));
        WebElement lengthInput = driver.findElement(By.id("el_f_lenght"));
        WebElement selectWebElement = driver.findElement(By.id("room_type"));
        WebElement selectWebElement2 = driver.findElement(By.id("heating_type"));
        WebElement calcButton = driver.findElement(By.name("button"));

        widthInput.sendKeys("20");
        lengthInput.sendKeys("15");

        Select selectType = new Select(selectWebElement);
        selectType.selectByIndex(3);
        Thread.sleep(2000);

        Select selectHeating = new Select(selectWebElement2);
        selectHeating.selectByIndex(2);
        Thread.sleep(2000);

        calcButton.click();

        Assert.assertEquals(driver.findElement(By.id("floor_cable_power")).getText(),
                "28620");
        Assert.assertEquals(driver.findElement(By.id("spec_floor_cable_power")).getText(),
                "95");
    }
}
