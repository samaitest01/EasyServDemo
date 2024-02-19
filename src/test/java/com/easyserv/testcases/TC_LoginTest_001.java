package com.easyserv.testcases;

import com.easyserv.functions.Loginfunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;


public class TC_LoginTest_001 extends BaseClass {


    @Test
    public void loginTest() throws InterruptedException {
        boolean testCaseStatus = false;

        driver.get(URL);
        Loginfunction LF = new Loginfunction(driver);
        BaseClass BC = new BaseClass();
        LF.LoginMethod(UserName, Password);
        testCaseStatus = LF.logoutmethod();
        // BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());
        if (testCaseStatus) {
            test.pass("Step Passed --> : " + "Description" + " " + new Object() {
            }.getClass().getEnclosingMethod().getName());

        } else {
            test.fail("Step Failed --> : " + "Description" + " " + new Object() {
            }.getClass().getEnclosingMethod().getName());
        }


    }
}
