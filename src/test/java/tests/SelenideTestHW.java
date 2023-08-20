package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTestHW {
    @Test
    public void userCanLogin() {
        Configuration.baseUrl = ReadProperties.getUrlHW();
        Configuration.timeout = 8000;
        //Configuration.browser = Browsers.CHROME;
        //Configuration.browser = "chrome";
        //Configuration.browserSize = "1920x1080";
        //Configuration.fastSetValue = true;
        //Configuration.headless = false;
        //Configuration.assertionMode = SOFT;

        open(ReadProperties.getUrlHW());
        //WebDriverRunner.getWebDriver().manage().window().maximize();
        //open("/");

        $(By.id("user-name")).setValue(ReadProperties.usernameHW());
        $("#password").val(ReadProperties.passwordHW());
        $("#login-button").click();

        $("#header_container > div.header_secondary_container > span")
                .shouldBe(visible, Duration.ofSeconds(20))
                .should(text("Products"));

    }
}
