package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CompletePage;

public class FinishStep  extends BaseStepHW {

    public FinishStep (WebDriver driver) {
        super(driver);
    }

    public CompletePage successFinish() {
        completePage.getComplete();
        return completePage;
    }

}