package steps;


import baseEntities.BaseStepHW;
import models.InfoBuyer;
import org.openqa.selenium.WebDriver;
import pages.InformationPage;
import pages.ProductPageHW;

public class AddInfoStep extends BaseStepHW {

    public AddInfoStep(WebDriver driver) {
        super(driver);
    }

    public InformationPage successAddInfo(InfoBuyer infoBuyer) {
        infoPage.addInfo(infoBuyer);

        return infoPage;
    }
}