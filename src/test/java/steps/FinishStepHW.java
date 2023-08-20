package steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CompletePage;

public class FinishStepHW  extends BaseStepHW {

    public FinishStepHW() {
        super();
    }

    public CompletePage successFinish() {
        completePage.getComplete();
        return completePage;
    }

}