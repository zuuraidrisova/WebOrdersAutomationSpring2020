package com.webOrders.tests;

import com.webOrders.pages.LoginPage;
import com.webOrders.utilities.BrowserUtil;
import com.webOrders.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test(description = "just login the web page and verify the title")
    public void loginTest() throws InterruptedException{

        LoginPage loginPage = new LoginPage();

        loginPage.login();

        Thread.sleep(5000);

        Assert.assertEquals(Driver.getDriver().getTitle(),"Web Orders");

        BrowserUtil.takeScreenShot();

        System.out.println("Verification passed!");

    }


}
