package com.easyserv.testcases;

import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.customersearch;
import org.junit.Test;

public class TC_Customersearch_Test_002 extends BaseClass
{
    @Test
    public void loginTest() throws InterruptedException
    {
        driver.get(URL);
        Login lp = new Login(driver);
        BaseClass BC = new BaseClass();
        lp.setTxtemail(UserName);
        lp.setTxtpwd(Password);
        lp.setBtnsignin();
        lp.setStore();
        lp.setNextbtn();
//        customersearch cs = new customersearch(driver);
//        cs.setCustomermngt();
//        cs.setSearchcst("sameer");
//        cs.setSearchbtn();
    }
    @Test
    public void customersearch()
    {
        customersearch cs = new customersearch(driver);
         cs.setCustomermngt();
         cs.setSearchcst("sameer");
         cs.setSearchbtn();

    }

}
