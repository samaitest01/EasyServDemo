package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.Functions;
import com.easyserv.pageobject.BookingManagementCalender;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_Filter_Test_007 extends BaseClass {

    @Test
    public void Filterbookingview() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginObject = new LoginFunction(driver);
        LoginObject.LoginMethod(UserName, Password);
        BookingManagementCalender BM = new BookingManagementCalender(driver);
        Functions fn = new Functions(driver);
        fn.ClickBookingManagement();
        fn.setlistview();
        fn.setFilterbutton();
        fn.SetFilterAll();
       captureScreenshot(driver, new Object() {}.getClass().getEnclosingMethod().getName());
    }
}
