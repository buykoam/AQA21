package baseEntities;

import pages.*;

public class BaseStepHW {
    protected LoginPageHW loginPage;
    protected ProductPageHW productPage;
    protected CartPageHW cartPage;
    protected InformationPage infoPage;
    protected CompletePage completePage;
    public BaseStepHW() {

        loginPage = new LoginPageHW();
        productPage = new ProductPageHW();
        cartPage = new CartPageHW();
        infoPage = new InformationPage();
        completePage = new CompletePage();
    }
}
