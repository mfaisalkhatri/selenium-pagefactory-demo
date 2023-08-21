package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.seleniumplayground.MainPage;
import org.testng.annotations.Test;

public class SeleniumPlaygroundTests extends BaseTest {



    @Test
    public void testMenus() {
        this.driverManager.getDriver().get("https://www.lambdatest.com/selenium-playground/");
        final var mainPage = new MainPage(this.driverManager.getDriver());
        System.out.println(mainPage.menuListSize());
    }
}
