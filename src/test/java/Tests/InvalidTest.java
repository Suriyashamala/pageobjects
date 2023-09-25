package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoggedPage;
import pageobject.StudentLoginPage;

import java.time.Duration;

public class InvalidTest {
    public static void main(String[] args){
    WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");

    StudentLoginPage studentLoginPage = new StudentLoginPage(driver);
    LoggedPage loggedPage = new LoggedPage(driver);

        studentLoginPage.fillUsername("sham");
        studentLoginPage.fillPassword("sham123");
        studentLoginPage.clickSubmit();

        driver.quit();

}
}
