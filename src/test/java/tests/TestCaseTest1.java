package tests;

import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class TestCaseTest1 extends BaseTestHW {

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