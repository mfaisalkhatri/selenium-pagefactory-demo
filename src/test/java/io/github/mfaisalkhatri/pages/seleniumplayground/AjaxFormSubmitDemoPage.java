package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxFormSubmitDemoPage {

    public AjaxFormSubmitDemoPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(id = "title"),
            @FindBy(name = "title")
    })
    private WebElement nameField;


    public void fillForm(final String name) {
        this.nameField.sendKeys(name);
    }
 }
