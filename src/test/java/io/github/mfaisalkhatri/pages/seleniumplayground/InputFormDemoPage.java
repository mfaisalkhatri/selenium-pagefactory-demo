package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InputFormDemoPage {
    public InputFormDemoPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBys({
            @FindBy(how = How.ID,  using = "seleniumform"),
            @FindBy(name = "name")
    })
    private WebElement nameField;

    public void fillForm(final String name) {
        this.nameField.sendKeys(name);
    }

}
