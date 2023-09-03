package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductPage;
import utils.configuration.ReadProperties;

public class E2ESteps extends BaseTest {
    private BaseTest baseTest;
    private LoginPage loginPage;
    private ProductPage productPage;

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
    public  void clickProduct() {
        productPage.getProductInput().click();
    }
    @And ("user click on the cart button")
    public  void clickCard(){
        productPage.getShoppingId();
    }
    @Then ("your cart page is displayed")
    public  void isCartPageDisplayed(){

    }
}