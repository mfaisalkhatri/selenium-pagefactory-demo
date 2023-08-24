package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage {
    public SimpleFormPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using="user-message")
    private WebElement enterMessageField;

    @FindBy(id = "showInput")
    private WebElement getCheckedValueBtn;

    @FindBy(id = "messages")
    private WebElement getMessage;


    public void enterMessage(final String message) {
        this.enterMessageField.sendKeys(message);
        this.getCheckedValueBtn.click();
    }

    public String getMessage () {
        return this.getMessage.getText();
    }


}
