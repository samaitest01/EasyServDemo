package com.easyserv.testcases;

import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.Loginfunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_ListView_Test_005 extends BaseClass {

    @Test
    public void bookingmanagement() throws InterruptedException {
        driver.get(URL);
        Loginfunction lp = new Loginfunction(driver);
        BaseClass BC = new BaseClass();
        lp.LoginMethod(UserName, Password);
        BookingCalenderFunction BM = new BookingCalenderFunction(driver);
        BM.ClickBookingManagement();
        BM.setChangeView();
        // BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());

    }

}
