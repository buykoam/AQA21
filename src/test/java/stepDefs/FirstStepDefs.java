package stepDefs;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class FirstStepDefs {
    @Given("открыт браузер")
    public void startBrowser() {
    }

    @When("страница логина открыта")
    public void openLoginPage() {
    }

    @Then("поле username отображается")
    public void isUsernameFieldDisplayed() {
        Assert.assertTrue(true);
    }

    @And("поле password отображается")
    public void isPasswordFieldDisplayed() {
        Assert.assertTrue(true);
    }
    @But("поле password не отображается")
    public void пisPasswordFieldNotDisplayed() {
        Assert.assertTrue(true);
    }
}
