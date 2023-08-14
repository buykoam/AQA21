package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
public class DropDown {
    private UIElement uiElement;
    private List<UIElement> dropDownItems;

    public DropDown(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.dropDownItems = new ArrayList<>();
    }

    public DropDown(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);

        for (UIElement element : uiElement.findUIElements(By.xpath("//parent::*/option"))) {
            dropDownItems.add(element);
        }
    }

        public void click() { uiElement.click();}
    public void getDropDownItem(String item) {

        for (UIElement element : dropDownItems) {
            if (element.getText().trim().contains(item)) {
                element.click();
            }
        }
    }
}
