package steps;

import baseEntities.BaseStep1;
import org.openqa.selenium.WebDriver;
import pages.CompletePage;

public class FinishStep  extends BaseStep1 {

    public FinishStep (WebDriver driver) {
        super(driver);
    }

    public CompletePage successFinish() {
        completePage.getComplete();
        return completePage;
    }

}
