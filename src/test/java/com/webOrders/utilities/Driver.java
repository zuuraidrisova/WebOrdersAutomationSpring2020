package com.webOrders.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){//private constructor so nobody is able to create an instance of this class

    }
    //the disadvantage of Singleton Design pattern is that u cannot do parallel testing,
    //u have to create other runner classes in order to do parallel testing

    private static WebDriver driver;

    public static WebDriver getDriver(){

        String browser = ConfigurationReader.getProperty("browser");

        if(driver == null){//if driver is not instanciated yet, then go to configuration.properties
            // file and based on browser type instanciate the driver

            switch (browser){

                case "chrome":
                case "Chrome":
                case "chrome-browser":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                default:
                    throw  new RuntimeException("Wrong browser name!");


            }
        }


        return driver;

    }



    public static void closeDriver() {

        if (driver != null) {

            driver.quit();
            driver = null;

        }

    }


}