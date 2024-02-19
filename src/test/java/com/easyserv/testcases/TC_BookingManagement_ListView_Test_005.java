package com.easyserv.testcases;

import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_ListView_Test_005 extends BaseClass {

    @Test
    public void bookingmanagement() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        BookingCalenderFunction BookingCalendar = new BookingCalenderFunction(driver);
        BookingCalendar.ClickBookingManagement();
        BookingCalendar.setChangeView();
        captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
