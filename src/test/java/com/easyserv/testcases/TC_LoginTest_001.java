package com.easyserv.testcases;

import com.easyserv.pageobject.Login;
import com.easyserv.testcases.BaseClass;
import org.testng.annotations.Test;


public class TC_LoginTest_001 extends BaseClass
{
    @Test
public void loginTest() throws InterruptedException
    {
    driver.get(URL);
    Login lp = new Login(driver);
    BaseClass BC = new BaseClass();
    lp.setTxtemail(UserName);
    lp.setTxtpwd(Password);
    lp.setBtnsignin();
    lp.setStore();
    lp.setNextbtn();
    Thread.sleep(3000);
    BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
