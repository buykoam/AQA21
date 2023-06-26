import data.StaticProviderDouble;
import data.StaticProviderInt;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
// домашняя работа
public class HWTest extends BaseTest {
    @Test (groups = "smoke")
    public void divIntTest() {
        int expectedValue = 3;
        int actualValue = calculator.div(6,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (groups = "smoke", dependsOnMethods = "divIntTest")
    public void divDoubleTest() {
        double expectedValue = 2.6;
        double actualValue = calculator.div(6.5,2.5);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (enabled = false)
    public void divIntTest_2() {
        int expectedValue = 3;
        int actualValue = calculator.div(6,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (enabled = false)
    public void divDoubleTest_2() {
        double expectedValue = 2.6;
        double actualValue = calculator.div(6.5,2.5);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (description = "Тест с описанием", groups = "regression", dependsOnMethods = "divDoubleTest")
    public void divIntTest_3() {
        int expectedValue = 3;
        int actualValue = calculator.div(6,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (description = "Тест с описанием", groups = "regression", dependsOnMethods = "divIntTest_3")
    public void divDoubleTest_3() {
        double expectedValue = 2.6;
        double actualValue = calculator.div(6.5,2.5);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (testName = "Test with Int", groups = "regression", dependsOnMethods = "divDoubleTest_3")
    public void divIntTest_4() {
        int expectedValue = 3;
        int actualValue = calculator.div(6,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (testName = "Test with Double", groups = "regression", dependsOnMethods = "divIntTest_4")
    public void divDoubleTest_4() {
        double expectedValue = 2.6;
        double actualValue = calculator.div(6.5,2.5);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (timeOut = 10000, groups = "smoke", dependsOnMethods = "divDoubleTest_4")
    public void divIntTest_5() throws InterruptedException {
        //Thread.sleep(10000);
        int expectedValue = 3;
        int actualValue = calculator.div(6,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (timeOut = 1000, groups = "smoke", dependsOnMethods = "divIntTest_5")
    public void divDoubleTest_5() throws InterruptedException {
//        Thread.sleep(1000);
        double expectedValue = 2.6;
        double actualValue = calculator.div(6.5,2.5);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3, groups = "regression", dependsOnMethods = "divDoubleTest_5")
    public void divIntTest_6() throws InterruptedException {
        Thread.sleep(500);
        int expectedValue = 3;
        int actualValue = calculator.div(6,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3, groups = "regression", dependsOnMethods = "divIntTest_6")
    public void divDoubleTest_6() throws InterruptedException {
        Thread.sleep(500);
        double expectedValue = 2.6;
        double actualValue = calculator.div(6.5,2.5);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (expectedExceptions = NullPointerException.class, groups = "regression", dependsOnMethods = "divDoubleTest_6")
    public void divIntTest_7() {
        List list = null;
        int size = list.size();
    }
    @Test (expectedExceptions = NullPointerException.class, groups = "regression", dependsOnMethods = "divIntTest_7")
    public void divDoubleTest_7() {
        List list = null;
        int size = list.size();
    }
    @Test (priority = 1, groups = "smoke", dependsOnMethods = "divDoubleTest_7")
    public void divIntTest_8() {
        int expectedValue = 3;
        int actualValue = calculator.div(6,2);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (priority = 2, groups = "smoke", dependsOnMethods = "divIntTest_8")
    public void divDoubleTest_8() {
        double expectedValue = 2.6;
        double actualValue = calculator.div(6.5,2.5);
        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }
    @Test (dataProvider = "Data for Div Int test", dataProviderClass = StaticProviderInt.class,  groups = "smoke", dependsOnMethods = "divDoubleTest_8" )
    public void divIntTest_9(int a, int b, int expectedValue) {
        Assert.assertEquals(calculator.div(a, b),expectedValue, "Значения не одинаковые");
    }
    @Test (dataProvider = "Data for Div Double test", dataProviderClass = StaticProviderDouble.class, groups = "smoke", dependsOnMethods = "divIntTest_9")
    public void divDoubleTest_9(double a, double b, double expectedValue) {
        Assert.assertEquals(calculator.div(a, b),expectedValue, "Значения не одинаковые");
    }
}