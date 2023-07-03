import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class CalcTestHW {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @Test
    public void calculatorIKTTest() throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        List<WebElement> buttonsList = driver.findElements(By.tagName("button"));
        System.out.println(buttonsList.size());

        WebElement widthInput = driver.findElement(By.id("el_f_width"));
        WebElement lengthInput = driver.findElement(By.id("el_f_lenght"));
        WebElement selectWebElement = driver.findElement(By.id("room_type"));
        WebElement selectWebElement2 = driver.findElement(By.id("heating_type"));
        WebElement calcButton = driver.findElement(By.name("button"));

        widthInput.sendKeys("20");
        lengthInput.sendKeys("15");

        Select selectType = new Select(selectWebElement);
        selectType.selectByIndex(3);
        Select selectHeating = new Select(selectWebElement2);
        selectHeating.selectByIndex(2);

        calcButton.click();

        assertTrue(driver.findElement(By.id("floor_cable_power")).getAttribute("value").equals("28620"),
                "Не верно высчитана Мощь нагревательного кабеля или мата, Вт");
        assertTrue(driver.findElement(By.id("spec_floor_cable_power")).getAttribute("value").equals("95"),
                "Не верно высчитана Удельная мощность нагревательного кабеля или мата, Вт/м2");
                }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

