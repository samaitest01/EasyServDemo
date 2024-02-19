package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_CustomerSearch_Test_002 extends BaseClass {

    @Test
    public void customersearch() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        BaseClass BC = new BaseClass();
        LoginObject.LoginMethod(UserName, Password);
        CustomerSearchFunction cs = new CustomerSearchFunction(driver);
        cs.setCustomerManagement();
        cs.setSearchCustomer("Trung Truong");
        cs.setSearchButton();

        // BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }


}