package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.configuration.ReadProperties;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);
    }

    protected abstract By getPageIdentifier() throws InterruptedException;
    protected abstract By getAddedCart() throws InterruptedException;

    public boolean isPageOpened() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }

    public boolean isCartAdded() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(getAddedCart()).isDisplayed();
    }
}