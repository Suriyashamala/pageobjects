package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoggedPage;
import pageobject.StudentLoginPage;

import java.time.Duration;

public class AdminTest {
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
        //       driver.quit();
    }

}