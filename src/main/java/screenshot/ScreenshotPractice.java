package screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoggedPage;
import pageobject.StudentLoginPage;
import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");

        StudentLoginPage studentLoginPage = new StudentLoginPage(driver);
        LoggedPage loggedPage = new LoggedPage(driver);

        studentLoginPage.fillUsername("student");
        studentLoginPage.fillPassword("Password123");
        studentLoginPage.clickSubmit();

        loggedPage.verifyLogged();

        // Take screenshot of dashboard
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("logged.png");
        try {
            FileUtils.copyFile(screenshotFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        driver.quit();
    }
}

