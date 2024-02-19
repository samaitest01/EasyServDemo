package com.easyserv.testcases;

import com.easyserv.functions.Loginfunction;
import com.easyserv.functions.CustomerSearchFunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_Customersearch_Test_002 extends BaseClass {

    @Test
    public void customersearch() throws InterruptedException {
        driver.get(URL);
        Loginfunction lp = new Loginfunction(driver);
        BaseClass BC = new BaseClass();
        lp.LoginMethod(UserName, Password);
        CustomerSearchFunction cs = new CustomerSearchFunction(driver);
        cs.setCustomerMngt();
        cs.setSearchCst("Trung Truong");
        cs.setSearchBtn();

        // BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }


}
