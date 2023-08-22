package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.seleniumplayground.InputFormDemoPage;
import io.github.mfaisalkhatri.pages.seleniumplayground.MainPage;
import io.github.mfaisalkhatri.pages.seleniumplayground.RadioButtonDemoPage;
import io.github.mfaisalkhatri.pages.seleniumplayground.SimpleFormPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SeleniumPlaygroundTests extends BaseTest {

    @Test
    public void testMenus() {
        this.driverManager.getDriver().get("https://www.lambdatest.com/selenium-playground/");
        final var mainPage = new MainPage(this.driverManager.getDriver());
        assertEquals(mainPage.menuListSize(), 37);
    }


    @Test
    public void testSimpleFormPage () {
        this.driverManager.getDriver().get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        final String message = "This is a message";
        final var simpleFormPage = new SimpleFormPage(this.driverManager.getDriver());
        simpleFormPage.enterMessage(message);
        assertEquals(simpleFormPage.getMessage(), message);
    }

    @Test
    public void testMaleRadioBtnSelection() {
        this.driverManager.getDriver().get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        final var radioButtonDemoPage = new RadioButtonDemoPage(this.driverManager.getDriver());
        radioButtonDemoPage.selectMaleRadioBtn();
        assertTrue(radioButtonDemoPage.isMaleRadioButtonSelected());
    }

    @Test
    public void testInputFormDemo() {
        this.driverManager.getDriver().get("https://www.lambdatest.com/selenium-playground/input-form-demo");
        final var inputFormDemoPage = new InputFormDemoPage(this.driverManager.getDriver());
        inputFormDemoPage.fillForm("Faisal");
    }

}
