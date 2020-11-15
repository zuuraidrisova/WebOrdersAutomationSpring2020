package com.webOrders.tests;

import com.webOrders.pages.LoginPage;
import com.webOrders.pages.OrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTest extends TestBase {


    @Test(description = "verification of order")
    public void verifyOrder(){

        //we come to the login page using beforeMethod and afterMethod annotations
        LoginPage loginPage = new LoginPage();

        loginPage.login();//method coming from loginPage to login our page
        loginPage.clickOnOrder();

        OrderPage orderPage = new OrderPage();

        //user enters product information
        orderPage.selectProduct("ScreenSaver");

        orderPage.setQuantity("12");

        orderPage.enterPricePerUnit("20");

        orderPage.enterDiscount("10");

        orderPage.clickToCalculate();

        //then user should verify that total of 216 is displayed
        Assert.assertEquals(orderPage.getTotal(), "180", "Total is not matching");

        //enter customer information
        orderPage.enterCustomerName("Test User");

        orderPage.enterStreet("5th Ave");

        orderPage.enterCity("New York");

        orderPage.enterState("New York");

        orderPage.enterZip("10011");

        orderPage.selectCard();

        orderPage.enterCardNumber("12345667898");

        orderPage.enterExpiryDate("12/24");

        orderPage.clickOnProcess();

        loginPage.clickOnViewAllOrders();





    }

}
