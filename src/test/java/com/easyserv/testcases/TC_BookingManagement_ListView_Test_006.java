package com.easyserv.testcases;

import com.easyserv.functions.Bookingcalenderfunction;
import com.easyserv.pageobject.BookingManagementCalender;
import com.easyserv.pageobject.Login;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_ListView_Test_006 extends BaseClass {

    @Test
    public void calenderview() throws InterruptedException {
        driver.get(URL);
        BaseClass BC = new BaseClass();
        Login LP = new Login(driver);
        LP.loginmethod(UserName,Password);
        Bookingcalenderfunction BM = new Bookingcalenderfunction(driver);
        BM.ClickBookingManagement();
        BM.setlistview();
        BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());


    }

}
