package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StatusCodePage {

    public StatusCodePage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindAll({
//            @FindBy(how = How.CSS, using = "#__next > section.mt-49 > div > p"),
//            @FindBy(css = ".container .w-full > p")

            @FindBy(how = How.ID , using= "title111"),
            @FindBy(how = How.NAME , using= "title111")


    })
    private WebElement statusCodeDetails;

    public void clickOnStatusCodes () {
         this.statusCodeDetails.click();
    }
}
