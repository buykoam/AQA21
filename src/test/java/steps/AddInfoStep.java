package steps;


import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.InformationPage;
import pages.ProductPageHW;

public class AddInfoStep extends BaseStepHW {

    public AddInfoStep(WebDriver driver) {
        super(driver);
    }

    public InformationPage successAddInfo(String firstname, String lastname, String code) {
        infoPage.addInfo(firstname, lastname, code);

        return infoPage;
    }
}