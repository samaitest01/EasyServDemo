package com.easyserv.testcases;
import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.customersearch;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_Customersearch_Test_002 extends BaseClass {

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
    }
    @Test
    public void customersearch() throws InterruptedException {
        customersearch cs = new customersearch(driver);
        Thread.sleep(3000);
        cs.setCustomermngt();
        cs.setSearchcst("Trung Truong");
        cs.setSearchbtn();
        Thread.sleep(3000);
        BaseClass BC = new BaseClass();
        BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
