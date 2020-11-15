package com.webOrders.tests;

import com.webOrders.utilities.BrowserUtil;
import com.webOrders.utilities.ConfigurationReader;
import com.webOrders.utilities.Driver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  abstract class TestBase {

    @BeforeMethod
    public void setUp(){

        String url = ConfigurationReader.getProperty("url");

        Driver.getDriver().get(url);

        Driver.getDriver().manage().window().maximize();

    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){

        //ITestResult is an interface coming from TestNG, which has methods to check
        // if ur tests are failing or not

       if(iTestResult.getStatus() == ITestResult.FAILURE ){

            BrowserUtil.takeScreenShot();
        }

        Driver.closeDriver();
    }

}
