package com.easyserv.testcases;

import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.Loginfunction;
import com.easyserv.selenium.BaseClass;
import org.testng.annotations.Test;

public class TC_BookingManagement_ListView_Test_006 extends BaseClass {

    @Test
    public void calenderview() throws InterruptedException {
        driver.get(URL);
        BaseClass BC = new BaseClass();
        Loginfunction LP = new Loginfunction(driver);
        LP.LoginMethod(UserName, Password);
        BookingCalenderFunction BM = new BookingCalenderFunction(driver);
        BM.ClickBookingManagement();
        BM.setlistview();
        // BC.captureScreenshot(driver, new Object(){}.getClass().getEnclosingMethod().getName());


    }

}
