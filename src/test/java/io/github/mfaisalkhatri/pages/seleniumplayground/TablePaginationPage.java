package io.github.mfaisalkhatri.pages.seleniumplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TablePaginationPage {


    public TablePaginationPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBys({
            @FindBy(how = How.ID, using = "table-id"),
            @FindBy(css = "thead > tr > th")
    })
    private List<WebElement> tableColumns;


    public int numberOfColumnsInTheTable() {
        return this.tableColumns.size();
    }



}
