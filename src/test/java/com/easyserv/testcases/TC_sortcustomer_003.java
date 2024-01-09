package com.easyserv.testcases;

import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.customersearch;
import com.easyserv.pageobject.sortcustomer;
import org.junit.Test;

public class TC_sortcustomer_003 extends BaseClass
{
    @Test
    public void sortcustomer()throws InterruptedException
    {
        driver.get(URL);
        Login lp = new Login(driver);
        BaseClass BC = new BaseClass();
        lp.setTxtemail(UserName);
        lp.setTxtpwd(Password);
        lp.setBtnsignin();
        lp.setStore();
        lp.setNextbtn();
        customersearch cs = new  customersearch(driver);
        cs.setCustomermngt();
        sortcustomer srt = new sortcustomer(driver);
        srt.setSortbyname();
        srt.setSortbyphone();
        srt.setGetSortbyemail();
        BC.captureScreenshot(driver,"LoginScreenshot");

    }

}
