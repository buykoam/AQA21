package tests;

import baseEntities.BaseTest1;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class TestCaseTest1 extends BaseTest1 {

    @Test
    public void successLoginTest() throws InterruptedException {
        Assert.assertTrue(
                loginStep.successLogin(ReadProperties.username(), ReadProperties.password()
                ).isPageOpened()
        );
        Assert.assertTrue(
                addCartStep.successAddCart().isCartAdded()
        );
        Assert.assertTrue(
                checkCartStep.successCheckCart().isPageOpened2()
        );
        Assert.assertTrue(
                addInfoStep.successAddInfo(ReadProperties.firstname(), ReadProperties.lastname(), ReadProperties.code()).getTitleInfo()
        );
        Assert.assertTrue(
                finishStep.successFinish().getCompleteHeader()
        );
    }
}