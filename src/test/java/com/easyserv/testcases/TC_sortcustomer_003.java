package com.easyserv.testcases;
import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.customersearch;
import com.easyserv.pageobject.sortcustomer;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_sortcustomer_003 extends BaseClass
{
    @Test
    public void sortcustomer()throws InterruptedException
    {
        driver.get(URL);
        Login lp = new Login(driver);
        BaseClass BC = new BaseClass();
        lp.loginmethod(UserName,Password);
       /* lp.setTxtemail(UserName);
        lp.setTxtpwd(Password);
        lp.setBtnsignin();
        lp.setStore();
        lp.setNextbtn();*/
        customersearch cs = new  customersearch(driver);
        cs.setCustomermngt();
        sortcustomer srt = new sortcustomer(driver);
        srt.setSortbyphone();
        srt.setGetSortbyemail();
        srt.setSortbyname();
        Thread.sleep(3000);
        BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
