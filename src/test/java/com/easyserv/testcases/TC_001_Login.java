package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.selenium.Base;
import com.easyserv.selenium.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TC_001_Login extends Base {


    @Test
    public void loginTest() throws InterruptedException {
        boolean testCaseStatus = false;

        driver.get(URL);
        LoginFunction LoginPage = new LoginFunction(driver);
        LoginPage.LoginMethod(UserName, Password);
        captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
