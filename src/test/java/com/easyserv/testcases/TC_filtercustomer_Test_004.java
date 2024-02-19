package com.easyserv.testcases;

import com.easyserv.functions.Loginfunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.pageobject.Filtercustomerlist;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_filtercustomer_Test_004 extends BaseClass {

    @Test
    public void Filtercustomer() throws InterruptedException {
        driver.get(URL);
        Loginfunction lp = new Loginfunction(driver);
        CustomerSearchFunction CS = new CustomerSearchFunction(driver);
        Filtercustomerlist FC = new Filtercustomerlist(driver);
        lp.LoginMethod(UserName, Password);
        CS.setCustomerMngt();
        FC.setFilterActive();


    }

}
