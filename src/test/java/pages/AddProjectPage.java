package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends BasePage {
    private final static String pagePath = "/index.php?/cases/add/1";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.className("page_title");
    private final By dropDownLocator = By.id("template_id_chzn");
    private final By textDropDownLocator = By.linkText("Behaviour Driven Development");

    // Блок инициализации
    public AddProjectPage(WebDriver driver) {
        super(driver);

    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLabelLocator);
    }
    public WebElement getdropDown() {
        return waitService.waitForExists(dropDownLocator);
    }
    public WebElement textDropDown() {
        return waitService.waitForExists(textDropDownLocator);
    }
    public void dropdown(){
        getdropDown().click();
        textDropDown().click();
    }
}
