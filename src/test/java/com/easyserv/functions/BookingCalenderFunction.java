package com.easyserv.functions;

import com.easyserv.pageobject.BookingManagementCalender;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BookingCalenderFunction extends BookingManagementCalender {
    WebDriver driver;

    public BookingCalenderFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void setlistview() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Listview.click();
        Thread.sleep(3000);

    }

    public void setFilterButton() {
        Filterbutton.click();
    }

    public void SetFilterAll() {
        FilterByAll.click();
    }

    public void SetFilterBookedin() {

        FilterBookedin.click();
    }

    public void SetFilterCheckedIn() {
        FilterCheckedIn.click();
    }

    public void SetFilterCompleted() {

        FilterCompleted.click();
    }

    public void SetFilterCancelled() {

        FilterCancelled.click();
    }

    public void SetApplyFilter() {

        ApplyFilter.click();
    }

    public void SetClearAll() {

        FilterClearAll.click();
    }

    public void SetPaymentStatus() {

        Paymentstatus.click();
    }

    public void SetPaymentStatusPaid() {

        PaymentstatusPaid.click();
    }

    public void SetPaymentStatusnotPaid() {

        PaymentstatusNotPaid.click();
    }

    public void SetPaymentStatusRefunded() {

        PaymentstatusRefunded.click();
    }

    public void SetPaymentStatusPartialRefunded() {
        PaymentstatusPartiallyRefunded.click();
    }

    public void ClickBookingManagement() throws InterruptedException {
        Bookingmanagement.click();

    }

    public void setChangeView() throws InterruptedException {
        Bookingmanagement.click();

        DayView.click();

        WeekView.click();

        MonthView.click();

    }


}
