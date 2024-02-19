package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.pageobject.FilterCustomerList;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_FilterCustomer_Test_004 extends BaseClass {

    @Test
    public void Filtercustomer() throws InterruptedException {
        driver.get(URL);
        LoginFunction lp = new LoginFunction(driver);
        CustomerSearchFunction CS = new CustomerSearchFunction(driver);
        FilterCustomerList FC = new FilterCustomerList(driver);
        lp.LoginMethod(UserName, Password);
        CS.setCustomerMngt();
        FC.setFilterActive();


    }

}
