package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.selenium.Base;
import com.easyserv.selenium.CustomListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TC_LoginTest_001 extends Base {


    @Test
    public void loginTest() throws InterruptedException {
        boolean testCaseStatus = false;

        driver.get(URL);
        Assert.assertEquals(false,true);
        //LoginFunction LoginPage = new LoginFunction(driver);
        //LoginPage.LoginMethod(UserName, Password);

        //testCaseStatus = LoginPage.logoutmethod();
       // captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());
        /*if (testCaseStatus) {
            test.pass("Step Passed --> : " + "Description" + " " + new Object() {
            }.getClass().getEnclosingMethod().getName());

        } else {
            test.fail("Step Failed --> : " + "Description" + " " + new Object() {
            }.getClass().getEnclosingMethod().getName());
        }*/




    }
}
