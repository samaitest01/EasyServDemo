package com.easyserv.testcases;

import com.easyserv.functions.FilterCustomerListFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.selenium.Base;
import org.testng.annotations.Test;

public class TC_004_FilterCustomer extends Base {

    @Test
    public void Filtercustomer() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        CustomerSearchFunction CustomerSearchObject = new CustomerSearchFunction(driver);
        FilterCustomerListFunction FilterCustomerObject = new FilterCustomerListFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        CustomerSearchObject.setCustomerManagement();
        FilterCustomerObject.setFilterActive();
        captureScreenshot(driver,new Object(){}.getClass().getEnclosingMethod().getName());


    }

}
