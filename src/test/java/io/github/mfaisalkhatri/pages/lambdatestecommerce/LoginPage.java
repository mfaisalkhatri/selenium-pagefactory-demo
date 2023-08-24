package io.github.mfaisalkhatri.pages.lambdatestecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class LoginPage {

    private final WebDriver driver;
    public LoginPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBys({
            @FindBy(how = How.CLASS_NAME, using = "card-body"),
            @FindBy(how = How.NAME, using = "email")
    })
    private WebElement userNameField;
//    @FindBy(how = How.ID, using = "input-email")
//    private WebElement userNameField;

    @FindBy(how = How.NAME, using = "password" )
    private WebElement passwordField;

    @FindBy (css = "input[type=\"submit\"]")
    private WebElement loginBtn;

    public MyAccountPage performLogin(final String userName, final String password) {
        this.userNameField.sendKeys(userName);
        this.passwordField.sendKeys(password);
        this.loginBtn.click();

        return new MyAccountPage(this.driver);
    }

}
