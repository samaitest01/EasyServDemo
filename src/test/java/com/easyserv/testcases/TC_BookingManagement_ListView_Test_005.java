package com.easyserv.testcases;

import com.easyserv.pageobject.BookingManagementCalender;
import com.easyserv.pageobject.Login;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_ListView_Test_005 extends BaseClass {

    @Test
    public void bookingmanagement()throws InterruptedException
    {
        driver.get(URL);
        Login lp = new Login(driver);
        BaseClass BC = new BaseClass();
        lp.loginmethod(UserName,Password);
        BookingManagementCalender BM = new BookingManagementCalender(driver);
        BM.ClickBookingManagement();
        BM.setChangeView();
        BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
