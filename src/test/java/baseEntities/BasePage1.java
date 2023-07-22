package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.configuration.ReadProperties;

public abstract class BasePage1 {
    protected WebDriver driver;

    public BasePage1(WebDriver driver) {
        this.driver = driver;
    }

    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);
    }

    protected abstract By getPageIdentifier() throws InterruptedException;
    protected abstract By getPageIdentifier2() throws InterruptedException;

    protected abstract By getAddedCart() throws InterruptedException;
    protected abstract By getTitle() throws InterruptedException;
    protected abstract By getHeader() throws InterruptedException;

    public boolean isPageOpened() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }
    public boolean getTitleInfo() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(getTitle()).isDisplayed();
    }
    public boolean getCompleteHeader() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(getHeader()).isDisplayed();
    }


    public boolean isCartAdded() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(getAddedCart()).isDisplayed();
    }
    public boolean isPageOpened2() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(getPageIdentifier2()).isDisplayed();
    }

}