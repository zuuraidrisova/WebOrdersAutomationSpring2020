package com.webOrders.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BrowserUtil{


    public static void takeScreenShot(){

       //TakesScreenshot is an interface which has only one method getScreenshotAs()
        //getScreenshotAs(OutputType.BYTES) takes one arg and returns array of bytes
      byte[] screenshot =  ((TakesScreenshot)(Driver.getDriver())).getScreenshotAs(OutputType.BYTES);

      String path = System.getProperty("user.dir") + File.separator +
                        "screenShots" + File.separator + "image.png";

      try(FileOutputStream file = new FileOutputStream(path)){

          file.write(screenshot);

      }catch (IOException e){

          e.printStackTrace();
      }

    }
}