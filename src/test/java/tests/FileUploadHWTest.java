package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPageHW;

public class FileUploadHWTest extends BaseTest {

    @Test
    public void uploadTest() {
        FileUploadPageHW fileUploadPage = new FileUploadPageHW(driver);
        fileUploadPage.openPageByUrl();

        String pathToFile = FileUploadHWTest.class.getClassLoader().getResource(" D:\\TeachMeAQA\\AQA21onl-testng\\src\\test\\resources\\download.jpeg").getPath();
        fileUploadPage.getButtonFileUpload().sendKeys(pathToFile);
        fileUploadPage.getButtonFileSubmit().click();
        Assert.assertEquals("download.jpeg",fileUploadPage.getLabelUploaded().getText());

    }
}



