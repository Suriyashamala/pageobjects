package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.PracticePage;
import pageobject.StudentLoginPage;

import java.time.Duration;

public class ExceptionsTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        StudentLoginPage studentLoginPage = new StudentLoginPage(driver);
        PracticePage practicePage = new PracticePage(driver);

        practicePage.clickedit();
        practicePage.clickadd();
    }

}
