package com.easyserv.testcases;

import com.easyserv.pageobject.BookingManagementCalender;
import com.easyserv.pageobject.Login;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_Filter extends BaseClass {

    @Test
    public void Filterbookingview() throws InterruptedException {
        driver.get(URL);
        BaseClass BC = new BaseClass();
        Login LP = new Login(driver);
        LP.loginmethod(UserName, Password);
        BookingManagementCalender BM = new BookingManagementCalender(driver);
        BM.ClickBookingManagement();
        BM.setlistview();
        BM.setFilterbutton();
        BM.SetFilterAll();

        BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
