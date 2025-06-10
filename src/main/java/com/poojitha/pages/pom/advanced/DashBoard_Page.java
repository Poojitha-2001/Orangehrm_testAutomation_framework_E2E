package com.poojitha.pages.pom.advanced;

import com.poojitha.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard_Page extends CommonToAllPages  {
    WebDriver driver;
    public DashBoard_Page(WebDriver driver){
        this.driver=driver;
    }
//pageLocators
    private By userNameOnDashboard = By.xpath("//h6[normalize-space()='PIM']");
//pageActions
    public String loggedInUserName(){
        return getText(userNameOnDashboard) ;
    }
}
