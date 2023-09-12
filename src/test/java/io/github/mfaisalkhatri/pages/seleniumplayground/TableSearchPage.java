package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TableSearchPage {


    public TableSearchPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".wrapper h1")
    @CacheLookup
    private WebElement pageHeader;


    @FindBy(css = "button.btn-default")
    @CacheLookup
    private WebElement filterBtn;


    @FindBy(css = "input[placeholder = \"Username\"]")
    @CacheLookup
    private WebElement userNameField;

    @FindBy(css = "input[placeholder = \"First Name\"]")
//    @CacheLookup
    private WebElement firstNameField;

    @FindBy(css = "input[placeholder = \"Last Name\"]")
//    @CacheLookup
    private WebElement lastNameField;

    @FindBy(css = ".table-responsive:nth-child(1) tbody tr:nth-child(3)")
//    @CacheLookup
    private WebElement tableRecord;

    public String pageHeaderText() {
        return this.pageHeader.getText();
    }

    public void searchForRecord(final String userName, final String firstName, final String lastName) {
        this.filterBtn.click();
        this.userNameField.sendKeys(userName);
        this.firstNameField.sendKeys(firstName);
        this.lastNameField.sendKeys(lastName);
    }

    public String tableRecordValues() {
        return this.tableRecord.getAttribute("textContent");
    }
}
