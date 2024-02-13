package com.easyserv.testcases;

import com.easyserv.functions.Bookingcalenderfunction;
import com.easyserv.functions.Loginfunction;
import com.easyserv.pageobject.BookingManagementCalender;
import com.easyserv.pageobject.Login;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_ListView_Test_005 extends BaseClass {

    @Test
    public void bookingmanagement()throws InterruptedException
    {
        driver.get(URL);
        Loginfunction lp = new Loginfunction(driver);
        BaseClass BC = new BaseClass();
        lp.loginmethod(UserName,Password);
        Bookingcalenderfunction BM = new Bookingcalenderfunction(driver);
        BM.ClickBookingManagement();
        BM.setChangeView();
        BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
