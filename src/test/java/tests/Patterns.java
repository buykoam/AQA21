package tests;

import baseEntities.BaseTestHW;
import helper.DataHelper;
import helper.InfoHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Patterns extends BaseTestHW {

    @Test
    public void E2ETestWithValueOfObject() throws InterruptedException {
        Assert.assertTrue(
                loginStep.successLogin(DataHelper.getAdminUser1()).isPageOpened()
        );
        Assert.assertTrue(
                addCartStep.successAddCart().isCartAdded()
        );
        Assert.assertTrue(
                checkCartStep.successCheckCart().isPageOpened2()
        );
        Assert.assertTrue(
                addInfoStep.successAddInfo(InfoHelper.getUserInfo()).getTitleInfo()
        );
        Assert.assertTrue(
                finishStep.successFinish().getCompleteHeader()
        );
    }
}