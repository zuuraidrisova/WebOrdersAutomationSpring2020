package com.webOrders.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {

        try{

            properties = new Properties();

            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();

        }catch (IOException e){

            e.printStackTrace();

            throw  new RuntimeException("Unable to find configuration.properties file!");
        }
    }


    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);
    }


    /*
    private static Properties properties;

    static {

        //if u put ur file inside try, no need to close it, it will do automatically
        //try is auto-closable
        try (FileInputStream file = new FileInputStream("configuration.properties")){

            properties = new Properties();

            properties.load(file);

        } catch (IOException e) {

            e.printStackTrace();
            throw new RuntimeException("Unable to find configuration.properties file!");
        }
    }

    public static String getProperty(String keyword){

       return properties.getProperty(keyword);

    }

     */
}
