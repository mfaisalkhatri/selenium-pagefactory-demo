package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonDemoPage {

    public RadioButtonDemoPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



}
