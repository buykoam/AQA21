package steps;


import baseEntities.BaseStep1;
import org.openqa.selenium.WebDriver;
import pages.InformationPage;
import pages.ProductPage1;

public class AddInfoStep extends BaseStep1 {

    public AddInfoStep(WebDriver driver) {
        super(driver);
    }

    public InformationPage successAddInfo(String firstname, String lastname, String code) {
        infoPage.addInfo(firstname, lastname, code);

        return infoPage;
    }
}