package com.easyserv.testcases;

import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.customersearch;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TC_Customersearch_Test_002 extends BaseClass {

    @Rule
    public TestWatcher screenshotOnFailure = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            String screenshotName = description.getMethodName() + "_failure";
            captureScreenshot(driver, screenshotName);
        }
    };

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
    }
    @Test
    public void customersearch()
    {
        customersearch cs = new customersearch(driver);
         cs.setCustomermngt();
         cs.setSearchcst("Trung Truong");
         cs.setSearchbtn();
         BaseClass BC = new BaseClass();
        BC.captureScreenshot(driver,"LoginScreenshot");

    }

}
