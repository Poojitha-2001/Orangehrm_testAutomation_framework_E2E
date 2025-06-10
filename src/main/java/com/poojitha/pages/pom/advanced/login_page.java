package com.poojitha.pages.pom.advanced;

import com.poojitha.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.poojitha.driver.DriverManager.getDriver;

public class login_page {
    WebDriver driver;
    public login_page(WebDriver driver){
        this.driver=driver;
    }
    //pageLocators
    private By username = By.xpath("//input[@placeholder='Username']");
    private By password = By.xpath("//input[@placeholder='Password']");
    private By submit_btn = By.xpath("//button[normalize-space()='Login']");
    //pageActions
    public void loginHrmCreds(String Username,String Password) throws InterruptedException {
        Thread.sleep(5000);
        CommonToAllPages p=new CommonToAllPages();
        p.enterInput(username,Username) ;
        p.enterInput(password,Password);
        p.clickElement(submit_btn);
        Thread.sleep(5000);

    }

}
