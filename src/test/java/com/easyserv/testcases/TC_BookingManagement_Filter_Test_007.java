package com.easyserv.testcases;

import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

import java.awt.print.Book;

public class TC_BookingManagement_Filter_Test_007 extends BaseClass {

    @Test
    public void Filterbookingview() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        BookingCalenderFunction BookingCalendarObject = new BookingCalenderFunction(driver);
        BookingCalendarObject.ClickBookingManagement();
        BookingCalendarObject.setListView();
        BookingCalendarObject.setFilterButton();
        BookingCalendarObject.SetFilterAll();
        BookingCalendarObject.SetFilterBookedin();
        //BookingCalendarObject.SetFilterCheckedIn();
       // BookingCalendarObject.SetFilterCompleted();
       // BookingCalendarObject.SetFilterCancelled();
        BookingCalendarObject.SetApplyFilter();
      //  BookingCalendarObject.SetClearAll();




       captureScreenshot(driver, new Object() {}.getClass().getEnclosingMethod().getName());
    }
}
