package io.github.mfaisalkhatri.pages.lambdatestecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class MyAccountPage {

    public MyAccountPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#content > div:nth-child(1) h2")
    @CacheLookup
    private WebElement myAccountTitle;

    public String getMyAccountPageTitle() {
        return this.myAccountTitle.getText();
    }

    @FindAll({
            @FindBy(how = How.LINK_TEXT, using = "Logout"),
            @FindBy(how = How.CSS, using = "#column-right > div > a:nth-child(14)")
    })
    private WebElement logoutLink;

    public void logoutFromEcommercePlayground() {
        this.logoutLink.click();
    }

}
