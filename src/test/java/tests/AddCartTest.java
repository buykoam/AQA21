package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class AddCartTest extends BaseTest {

    @Test
    public void addCartTest() throws InterruptedException {
        Assert.assertTrue(
                addCartStep.successAddCart().isCartAdded()
        );
    }
}