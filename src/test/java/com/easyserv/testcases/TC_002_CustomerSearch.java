package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.selenium.Base;
import com.easyserv.selenium.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class TC_002_CustomerSearch extends Base {

    @Test
    public void customersearch() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        CustomerSearchFunction cs = new CustomerSearchFunction(driver);
        cs.setCustomerManagement();
        cs.setSearchCustomer("Trung Truong");
        cs.setSearchButton();
        captureScreenshot(driver,new Object(){}.getClass().getEnclosingMethod().getName());

    }


}
