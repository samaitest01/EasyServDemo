package com.easyserv.testcases;

import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.pageobject.BookingCalender;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_Filter_Test_007 extends BaseClass {

    @Test
    public void Filterbookingview() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        BookingCalenderFunction BookingCalendarObject = new BookingCalenderFunction(driver);
        BookingCalendarObject.setlistview();
        BookingCalendarObject.setChangeView();
        BookingCalendarObject.setFilterButton();




       captureScreenshot(driver, new Object() {}.getClass().getEnclosingMethod().getName());
    }
}
