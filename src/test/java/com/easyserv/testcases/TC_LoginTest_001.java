package com.easyserv.testcases;

import com.easyserv.pageobject.Login;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;


public class TC_LoginTest_001 extends BaseClass
{
    @Test
public void loginTest() throws InterruptedException
    {
    driver.get(URL);
    Login lp = new Login(driver);
    BaseClass BC = new BaseClass();
    lp.loginmethod(UserName,Password);
    lp.logoutmethod();
   BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());
    }

}
