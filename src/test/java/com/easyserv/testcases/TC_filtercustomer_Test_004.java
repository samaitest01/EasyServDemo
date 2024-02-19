package com.easyserv.testcases;

import com.easyserv.functions.Loginfunction;
import com.easyserv.pageobject.Filtercustomerlist;
import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.customersearch;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_filtercustomer_Test_004 extends BaseClass {

    @Test
    public void Filtercustomer() throws InterruptedException {
        driver.get(URL);
        Loginfunction lp = new Loginfunction(driver);
        customersearch cs = new customersearch(driver);
        Filtercustomerlist FC = new Filtercustomerlist(driver);
        BaseClass BC = new BaseClass();
        lp.loginmethod(UserName, Password);
        cs.setCustomermngt();
        FC.setFilterActive();


    }

}
