package com.easyserv.testcases;

import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.selenium.Base;
import org.testng.annotations.Test;

public class TC_005_BookingManagement_ChangeView extends Base {

    @Test
    public void bookingmanagement() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        BookingCalenderFunction BookingCalendarObject = new BookingCalenderFunction(driver);
        BookingCalendarObject.ClickBookingManagement();
        BookingCalendarObject.setChangeView();
       // captureScreenshot(driver,new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
