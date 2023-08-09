package tests;

import baseEntities.BaseTestHW;
import helper.DataHelper;
import helper.InfoHelper;
import models.InfoBuyerBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;
import utils.configuration.ReadPropertiesHW;

public class Patterns extends BaseTestHW {
    @Test
    public void E2EPageFactoryTestHW() throws InterruptedException {
        Assert.assertTrue(
                loginStep2.successLogin(
                                ReadPropertiesHW.username(),
                                ReadPropertiesHW.password()
                        )
                        .isPageOpened()
        );
    }
    @Test
    public void E2EChainOfInvocationsTestHW()  throws InterruptedException{
        //loginPage.getEmail(ReadPropertiesHW.username()) - РУГАЕТСЯ НА loginPage, НЕ МОГУ ПОНЯТЬ В ЧЕМ ПРИЧИНА
//                .getPassword(ReadPropertiesHW.password())
//                .getLogInButton();
    }

    @Test
    public void E2EWithValueOfObjectTestHW() throws InterruptedException {
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

    @Test
    public void E2EBuilderTestHW() throws InterruptedException  {
        Assert.assertTrue(
                loginStep.successLogin(DataHelper.getAdminUser1()).isPageOpened()
        );
        Assert.assertTrue(
                addCartStep.successAddCart().isCartAdded()
        );
        Assert.assertTrue(
                checkCartStep.successCheckCart().isPageOpened2()
        );
        InfoBuyerBuilder infoBuyerBuilder = new InfoBuyerBuilder.Builder()
                .withFirstName("Test")
                .withLastName("Test")
                .withCode("123")
                .build();
    }
}