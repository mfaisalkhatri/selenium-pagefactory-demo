package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage {
    private final WebDriver driver;
    public SimpleFormPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.ID, using="user-message")
    private WebElement enterMessageField;

    @FindBy(id = "showInput")
    private WebElement getCheckedValueBtn;


    public void enterMessage() {
        this.enterMessageField.sendKeys("This is a test message");
        this.getCheckedValueBtn.click();
    }


}
