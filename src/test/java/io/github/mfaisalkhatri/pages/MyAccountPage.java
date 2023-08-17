package io.github.mfaisalkhatri.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#content > div:nth-child(1) h2")
    private WebElement myAccountTitle;

    public String getMyAccountPageTitle() {
        return this.myAccountTitle.getText();
    }

    @FindAll({
            @FindBy(how = How.LINK_TEXT, using = "Logout1"),
            @FindBy(how = How.CSS, using = "#column-right > div > a:nth-child(15)")
    })
    private WebElement logoutLink;

    public void logoutFromEcommercePlayground() {
        this.logoutLink.click();
    }

}
