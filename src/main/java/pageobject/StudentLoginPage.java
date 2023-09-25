package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentLoginPage {
    WebDriver ldriver;
    private static final By USERNAME = By.xpath("//input[@id='username']");
    private static final By PASSWORD= By.xpath("//input[@name='password']");
    private static final By SUBMIT = By.xpath("//button[@id='submit']");

    public StudentLoginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
    }
    public void fillUsername(String username) {

        ldriver.findElement(USERNAME).sendKeys(username);
    }
    public void fillPassword(String password) {

        ldriver.findElement(PASSWORD).sendKeys(password);
    }
    public void clickSubmit() {

        ldriver.findElement(SUBMIT).click();
    }

}
