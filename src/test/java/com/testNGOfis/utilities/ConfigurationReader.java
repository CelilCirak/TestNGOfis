package com.testNGOfis.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties;

    static {
        String path = "configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        } catch (Exception e) {
            System.out.println("Properties dosyasi bulunamadi");

        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}