package io.github.mfaisalkhatri.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    private final WebDriver driver;
    public LoginPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(how = How.NAME, using = "email"),
            @FindBy(how = How.NAME, using = "password")
    })
    private List<WebElement> fieldsOnLoginPage;
    @FindBy(how = How.ID, using = "input-email")
    private WebElement userNameField;

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

    public MyAccountPage loginIntoECommercePlayGround(final String userName, final String password) {
        this.fieldsOnLoginPage.get(0).sendKeys(userName);
        this.fieldsOnLoginPage.get(1).sendKeys(password);
        this.loginBtn.click();

        return new MyAccountPage(this.driver);
    }

}
