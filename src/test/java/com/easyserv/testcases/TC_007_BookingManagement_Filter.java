package com.easyserv.testcases;

import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.selenium.Base;
import org.testng.annotations.Test;

public class TC_007_BookingManagement_Filter extends Base {

    @Test
    public void FilterBookingView() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        BookingCalenderFunction BookingCalendarObject = new BookingCalenderFunction(driver);
        BookingCalendarObject.ClickBookingManagement();
        BookingCalendarObject.setListView();
        BookingCalendarObject.setFilterButton();
        BookingCalendarObject.SetFilterAll();
        BookingCalendarObject.SetFilterBookedin();
        BookingCalendarObject.SetApplyFilter();
       captureScreenshot(driver,new Object() {}.getClass().getEnclosingMethod().getName());
    }
}
