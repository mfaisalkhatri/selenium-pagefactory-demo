package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.LoginPage;
import io.github.mfaisalkhatri.pages.MyAccountPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LambdaTestEcommercePlaygroundTests extends BaseTest {


    @Test
    public void testLoginWithFindBy() {
        this.driverManager.getDriver().get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        final LoginPage loginPage = new LoginPage(this.driverManager.getDriver());
        final MyAccountPage myAccountPage = loginPage.performLogin("john+2@gmail.com", "Pass@1234");

        assertEquals(myAccountPage.getMyAccountPageTitle(), "My Account");
        myAccountPage.logoutFromEcommercePlayground();


    }

    @Test
    public void testLoginWithFindBys() {
        this.driverManager.getDriver().get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        final LoginPage loginPage = new LoginPage(this.driverManager.getDriver());
        final MyAccountPage myAccountPage = loginPage.loginIntoECommercePlayGround("john+2@gmail.com", "Pass@1234");

        assertEquals(myAccountPage.getMyAccountPageTitle(), "My Account");
        myAccountPage.logoutFromEcommercePlayground();
    }

}