package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.selenium.Base;
import org.testng.annotations.Test;

public class TC_CustomerSearch_Test_002 extends Base {

    @Test
    public void customersearch() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        Base BC = new Base();
        LoginObject.LoginMethod(UserName, Password);
        CustomerSearchFunction cs = new CustomerSearchFunction(driver);
        cs.setCustomerManagement();
        cs.setSearchCustomer("Trung Truong");
        cs.setSearchButton();

        // BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }


}
