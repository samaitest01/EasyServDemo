package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.pageobject.SortCustomer;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_SortCustomer_003 extends BaseClass {
    @Test
    public void SortCustomer() throws InterruptedException {
        driver.get(URL);
        LoginFunction lp = new LoginFunction(driver);
        BaseClass BC = new BaseClass();
        lp.LoginMethod(UserName, Password);
        CustomerSearchFunction CS = new CustomerSearchFunction(driver);
        CS.setCustomerMngt();
        SortCustomer srt = new SortCustomer(driver);
        srt.setSortbyphone();
        srt.setGetSortbyemail();
        srt.setSortbyname();
        Thread.sleep(3000);
        //  BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
