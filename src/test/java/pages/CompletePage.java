package pages;

import baseEntities.BasePage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage extends BasePage1 {

    // Блок описания локаторов для элементов
    private final By finishButtonLocator = By.id("finish");
    private final By completeHeader= By.xpath("//div[text() = 'Your order has been dispatched, and will arrive just as fast as the pony can get there!']");

    // Блок инициализации
    public CompletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() throws InterruptedException {
        return null;
    }

    @Override
    protected By getPageIdentifier2() throws InterruptedException {
        return null;
    }

    @Override
    protected By getAddedCart() throws InterruptedException {
        return null;
    }

    @Override
    protected By getTitle() throws InterruptedException {
        return null;
    }

    @Override
    protected By getHeader() throws InterruptedException {
        return completeHeader;
    }

    // Блок атомарных методов
    public WebElement getFinishButton() {
        return driver.findElement( finishButtonLocator);
    }

    // Блок комплексных методов
    public void getComplete() {
        getFinishButton().click();
    }
}
