package com.easyserv.testcases;

import com.easyserv.pageobject.BookingManagementCalender;
import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.customersearch;
import com.easyserv.pageobject.sortcustomer;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_Test_005 extends BaseClass {

    @Test
    public void bookingmanagement()throws InterruptedException
    {
        driver.get(URL);
        Login lp = new Login(driver);
        BaseClass BC = new BaseClass();
        lp.loginmethod(UserName,Password);
        BookingManagementCalender BM = new BookingManagementCalender(driver);
        BM.setChangeView();
        BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
