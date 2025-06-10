package com.poojitha.base;

import com.poojitha.driver.DriverManager;
import com.poojitha.utils.propertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.poojitha.driver.DriverManager.getDriver;

public class CommonToAllPages {
    public void openOrangeHRMUrl(){
        getDriver().get(propertyReader.readKey("ohr_url"));
    }
    public void clickElement(By by){
        getDriver().findElement(by).click() ;
    }
    public void clickElement1(WebElement e){
        e.click();
    }
    public void enterInput(By by,String key){
        getDriver().findElement(by).sendKeys(key) ;

    }
    public void enterInput1(WebElement e,String key){
        e.sendKeys(key) ;
    }
    public String getText(By by){
       return  getDriver().findElement(by).getText() ;
    }
    public String getText1(WebElement e){
        return e.getText() ;
    }
}
