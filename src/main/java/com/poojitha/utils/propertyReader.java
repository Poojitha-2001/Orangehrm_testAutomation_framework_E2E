package com.poojitha.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyReader {
    public static String readKey(String key) {
        Properties p;
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/data.properties");
            p = new Properties();
            p.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       return  p.getProperty(key);
    }}
