package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.ContactPage;
import pageobject.StudentLoginPage;

import java.time.Duration;

public class ContactTest {
    public static void main(String[] args ){
    WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/contact/");

    StudentLoginPage studentLoginPage = new StudentLoginPage(driver);
    ContactPage contactPage = new ContactPage(driver);

        contactPage.enterfirstname("sham");
        contactPage.enterlastname("mala");
        contactPage.enteremail("sham@123");
}
}

