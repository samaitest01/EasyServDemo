package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.functions.SortCustomerFunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_SortCustomer_003 extends BaseClass {
    @Test
    public void SortCustomer() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginObject(UserName, Password);
        CustomerSearchFunction CustomerSearch = new CustomerSearchFunction(driver);
        CustomerSearch.setCustomerManagement();
        SortCustomerFunction SortCustomer = new SortCustomerFunction(driver);
        SortCustomer.setSortbyphone();
        SortCustomer.setGetSortbyemail();
        SortCustomer.setSortbyname();
        captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
