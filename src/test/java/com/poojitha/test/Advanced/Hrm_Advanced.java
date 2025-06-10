package com.poojitha.test.Advanced;

import com.poojitha.base.CommonToAllPages;
import com.poojitha.base.CommonToAllTest;
import com.poojitha.pages.pom.advanced.DashBoard_Page;
import com.poojitha.pages.pom.advanced.login_page;
import com.poojitha.utils.propertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.poojitha.driver.DriverManager.getDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Hrm_Advanced extends CommonToAllTest  {
    @Test
    public void test_hrm() throws InterruptedException {
        CommonToAllPages p=new CommonToAllPages() ;
        p.openOrangeHRMUrl();
        login_page loginPage=new login_page(getDriver());
        loginPage.loginHrmCreds(propertyReader.readKey("ohr_username"),propertyReader.readKey("ohr_password") );
        DashBoard_Page dashBoardPage =new DashBoard_Page(getDriver() ) ;
        String loggedInUserName=dashBoardPage.loggedInUserName();
        Assert.assertEquals(loggedInUserName,propertyReader.readKey("ohr_expected_username") );
        assertThat(loggedInUserName).isNotNull().isNotEmpty().isEqualTo(propertyReader.readKey("ohr_expected_username")) ;

    }
}
