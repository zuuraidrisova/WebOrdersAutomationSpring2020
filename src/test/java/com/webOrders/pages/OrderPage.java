package com.webOrders.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrderPage extends BasePage {

    @FindBy(xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")
    private WebElement productDropdown;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    private WebElement quantityInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtUnitPrice']")
    private WebElement pricePerUnitInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtDiscount']")
    private WebElement discountInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtTotal']")
    private WebElement total;

    @FindBy(xpath = "//input[@value='Calculate']")
    private WebElement calculateButton;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    private   WebElement streetInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    private WebElement stateInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    private WebElement zipCodeInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")
    private WebElement visaRadioButton;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    private WebElement cardNumberInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    private WebElement expireDateInput;

    @FindBy(linkText = "Process")
    private WebElement processButton;

    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[2]")
    private List<WebElement> namesColumn;

    public void selectProduct(String productName){

        Select select = new Select(productDropdown);

        select.selectByVisibleText(productName);

    }

    public void setQuantity(String quantity){

        //delete old value and enter a new value
        quantityInput.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT, Keys.END),quantity);
    }

    public void enterPricePerUnit(String price){

        //delete old value and enter a new value
        quantityInput.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT, Keys.END),price);
    }

    public void enterDiscount(String discount){

        //delete old value and enter a new value
        quantityInput.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT, Keys.END),discount);

    }

    public String getTotal(){

      return total.getAttribute("value");
    }

    public void clickToCalculate(){

        calculateButton.click();
    }


    public void enterCustomerName(String customerName){

        nameInput.sendKeys(customerName);
    }


    public void enterStreet(String streetName){

        streetInput.sendKeys(streetName);
    }


    public void enterCity(String cityName){

        cityInput.sendKeys(cityName);
    }

    public void enterState(String stateName){

        stateInput.sendKeys(stateName);
    }

    public void enterZip(String zipCode){

        zipCodeInput.sendKeys(zipCode);
    }

    public void selectCard(){

        visaRadioButton.click();
    }

    public void enterCardNumber(String cardNumber){

        cardNumberInput.sendKeys(cardNumber);
    }

    public void enterExpiryDate(String expireDate){

        expireDateInput.sendKeys(expireDate);
    }

    public void clickOnProcess(){

        processButton.click();
    }






}
