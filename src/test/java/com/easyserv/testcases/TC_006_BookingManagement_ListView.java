package com.easyserv.testcases;

import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.selenium.Base;
import org.testng.annotations.Test;

public class TC_006_BookingManagement_ListView extends Base {

    @Test
    public void calenderview() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        BookingCalenderFunction BookingCalendar = new BookingCalenderFunction(driver);
        BookingCalendar.ClickBookingManagement();
        BookingCalendar.setListView();
        captureScreenshot(driver,new Object(){}.getClass().getEnclosingMethod().getName());
    }

}
