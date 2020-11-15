package com.webOrders.pages;

import com.webOrders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    //this is explicit wit, which will be used inside all page classes
    //since it is protected it will not be visible in test classes
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
        //this line will allow us to use FindBy, FindBys annotations
    }

    @FindBy(linkText = "View all orders")
    private WebElement viewAllOrders;

    @FindBy(linkText = "Order")
    private WebElement order;

    @FindBy(linkText = "View all products")
    private WebElement viewAllProducts;


    public void clickOnViewAllOrders(){

        System.out.println("Clicking on View all orders page");

        wait.until(ExpectedConditions.elementToBeClickable(viewAllOrders));

        viewAllOrders.click();
    }

    public void clickOnViewAllProducts(){

        System.out.println("Clicking on View all products page");

        wait.until(ExpectedConditions.elementToBeClickable(viewAllProducts));

        viewAllProducts.click();
    }

    public void clickOnOrder(){

        System.out.println("Clicking on Order page");

        wait.until(ExpectedConditions.elementToBeClickable(order));

        order.click();
    }




}
