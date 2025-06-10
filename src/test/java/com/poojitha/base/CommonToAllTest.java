package com.poojitha.base;

import com.poojitha.driver.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonToAllTest {
    @BeforeTest
    public static void Start(){
        DriverManager.init() ;
    }
    @AfterTest
    public static void close(){
        DriverManager.down();
    }
}
