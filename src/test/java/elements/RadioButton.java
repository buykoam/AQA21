package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class RadioButton {
    private UIElement uiElement;
    private List<UIElement> cellRadioButtons;

    public RadioButton(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        List<UIElement> cellRadioButtons;
    }

    public RadioButton(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }

    public boolean isRadioButtonClick(UIElement radioButton) {
        return radioButton.isSelected();
    }
    public UIElement getRadioButton(int index) {
        return cellRadioButtons.get(index).findElement(By.tagName("input"));
    }

    public UIElement getRadioButtonByName(String radioButtonName) {

        for (UIElement cell : cellRadioButtons) {
            UIElement tagStrong = cell.findElement(By.tagName("strong"));
            if (tagStrong.getText().equals(radioButtonName)) {
                return cell.findElement(By.tagName("input"));
            }
        } return null;
    }
}
