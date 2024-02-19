package com.easyserv.testcases;

import com.easyserv.functions.FilterCustomerListFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_FilterCustomer_Test_004 extends BaseClass {

    @Test
    public void Filtercustomer() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        CustomerSearchFunction CustomerSearchObject = new CustomerSearchFunction(driver);
        FilterCustomerListFunction FilterCustomerObject = new FilterCustomerListFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        ;
        CustomerSearchObject.setCustomerManagement();
        FilterCustomerObject.setFilterActive();


    }

}
