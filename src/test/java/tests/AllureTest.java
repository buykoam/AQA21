package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureTest {
    @Test
    @Description("Some detailed test description")
    public  void testName_1 (){
        Assert.assertTrue(true);
    }
    @Test (description="Human-readable test name")
    public  void testName_2 (){
        Assert.assertTrue(true);
    }
}
