package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;
import utils.configuration.ReadProperties;

public class E2ESteps extends BaseTest {
    private BaseTest baseTest;
    private LoginPage loginPage;
    private ProductPage productPage;
    private CartPage cartPage;
    private InformationPage informationPage;
    private CompletePage completePage;

    public E2ESteps(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Given("start browser")
    public void startBrowser() {

    }

    @Given("open login page")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
    }

    @When("user enter username {} and password {}")
    public void setUsernameAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.getUserInput().sendKeys(username);
        loginPage.getPswInput().sendKeys(password);
    }

    @When("user clicks login button")
    public void clickLoginButton() {
        loginPage.getLogInButton().click();
    }

    @Then("products page is displayed")
    public void isProductPageDisplayed() {
        Assert.assertTrue(new ProductPage(driver).isPageOpened());
    }

    @And("user click on the product")
    public void clickProduct() {
        productPage = new ProductPage(driver);
        productPage.getProductInput().click();
    }

    @And("user click on the cart button")
    public void clickCard() {
        productPage.getAddButtonInput().click();
        productPage.getShoppingId().click();
    }
    @Then("your cart page is displayed")
    public void isCartPageDisplayed() {
        Assert.assertTrue(new CartPage(driver).isPageOpened());
    }
    @And("user click on the checkout button")
    public void clickCheckout() {
        cartPage= new CartPage(driver);
        cartPage.getCheckoutId().click();
    }
    @Then("your information page is displayed")
    public void isInfoPageDisplayed() {
        Assert.assertTrue(new InformationPage(driver).isPageOpened());
    }
    @And("user enter firstname {} and lastname {} and code {}")
    public void setInfo(String firstname, String lastname, String code) {
        informationPage = new InformationPage(driver);
        informationPage.getFirstNameInput().sendKeys(firstname);
        informationPage.getLastNameInput().sendKeys(lastname);
        informationPage.getCode().sendKeys(code);
        informationPage.getCheck().click();
    }
    @And("user click on the finish button")
    public void clickFinish(){
    completePage = new CompletePage(driver);
    completePage.getFinishButton();
    }
    @Then("complete page is displayed")
    public void isCompletePageDisplayed() {
        Assert.assertTrue(new CompletePage(driver).isPageOpened());
    }
}