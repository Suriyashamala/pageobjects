package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    WebDriver ldriver;
    private static final By FIRSTNAME = By.xpath("//input[@id='wpforms-161-field_0']");
    private static final By LASTNAME = By.xpath("//input[@id='wpforms-161-field_0-last']");
    private static final By EMAIL = By.xpath("//input[@id='wpforms-161-field_1']");
    public ContactPage(WebDriver rdriver)
    {
        ldriver = rdriver;
    }
    public void enterfirstname(String firstname) {

        ldriver.findElement(FIRSTNAME).sendKeys(firstname);
    }
    public void enterlastname(String lastname) {

        ldriver.findElement(LASTNAME).sendKeys(lastname);
    }
    public void enteremail(String email) {

        ldriver.findElement(EMAIL).sendKeys(email);
    }
}


