package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected DriverManager driverManager;

    @BeforeMethod(alwaysRun = true)
    public void testSetup() {
        this.driverManager = new DriverManager();
        this.driverManager.createChromeDriverLocal();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        this.driverManager.quitDriver();
    }
}
