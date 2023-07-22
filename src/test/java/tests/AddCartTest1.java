package tests;

import baseEntities.BaseTest1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCartTest1 extends BaseTest1 {

    @Test

    public void addCartTest() throws InterruptedException {
        Assert.assertTrue(
                addCartStep.successAddCart().isCartAdded()
        );
    }
}