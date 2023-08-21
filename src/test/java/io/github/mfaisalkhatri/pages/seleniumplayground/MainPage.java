package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public MainPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".container__selenium ul li a")
    private List<WebElement> menus;

    public int menuListSize () {
        return this.menus.size();
    }
}
