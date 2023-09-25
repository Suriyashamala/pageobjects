package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticePage {
    WebDriver ldriver;
    private static final By EDIT = By.xpath("//button[@id='edit_btn']");
    private static final By ADD = By.xpath("//button[@id='add_btn']");

    public PracticePage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void clickedit() {
        ldriver.findElement(EDIT).click();
    }

    public void clickadd() {
        ldriver.findElement(ADD).click();

    }
}

