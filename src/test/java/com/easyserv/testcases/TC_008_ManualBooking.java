package com.easyserv.testcases;
import com.easyserv.functions.BookingCalenderFunction;
import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.NewBookingFunction;
import com.easyserv.selenium.Base;
import com.easyserv.selenium.CustomListener;
import com.easyserv.selenium.UpdateReports;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)

public class TC_008_ManualBooking extends Base {

    @Test
  public void ManualBooking() throws InterruptedException {
        driver.get(URL);
        LoginFunction LoginPage = new LoginFunction(driver);
        LoginPage.LoginMethod(UserName, Password);
        NewBookingFunction Booking = new NewBookingFunction(driver);
        BookingCalenderFunction BookingCalendarObject = new BookingCalenderFunction(driver);
        BookingCalendarObject.ClickBookingManagement();
        Booking.NewBooking();

    }


}
