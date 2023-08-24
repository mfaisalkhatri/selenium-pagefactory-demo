package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonDemoPage {

    public RadioButtonDemoPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBys({
            @FindBy(how = How.CLASS_NAME, using = "container"),
            @FindBy(css = "input[value=\"Males\"]")
    })
    private WebElement maleRadioBtn;

    public void selectMaleRadioBtn() {
        this.maleRadioBtn.click();
    }

    public boolean isMaleRadioButtonSelected() {
        return this.maleRadioBtn.isSelected();

    }


}
