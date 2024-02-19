package com.easyserv.testcases;

import com.easyserv.functions.Loginfunction;
import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.customersearch;
import com.easyserv.selenium.BaseClass;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.testng.annotations.Test;

public class TC_Customersearch_Test_002 extends BaseClass {

    @Test
    public void customersearch() throws InterruptedException {
        driver.get(URL);
        Loginfunction lp = new Loginfunction(driver);
        BaseClass BC = new BaseClass();
        lp.loginmethod(UserName, Password);
        customersearch cs = new customersearch(driver);
        cs.setCustomermngt();
        cs.setSearchcst("Trung Truong");
        cs.setSearchbtn();
        Thread.sleep(3000);
        // BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }


}
