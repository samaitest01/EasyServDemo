package com.easyserv.functions;

import com.easyserv.pageobject.BookingManagementCalender;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class functions extends BookingManagementCalender {
    WebDriver driver;

    public functions(WebDriver rdriver) {
        super(rdriver);
    }

    public void setlistview() throws InterruptedException {

        Listview.click();
        Thread.sleep(3000);

    }

    public void setFilterbutton() {

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

    public void SetFiltercancelled() {

        FilterCancelled.click();
    }

    public void SetApplyFilter() {

        ApplyFilter.click();
    }

    public void SetClearAll() {

        FilterClearAll.click();
    }

    public void Setpaymentstatus() {

        Paymentstatus.click();
    }

    public void SetPaymentstatuspaid() {

        PaymentstatusPaid.click();
    }

    public void SetPaymentstatusnotpaid() {

        PaymentstatusNotPaid.click();
    }

    public void SetPaymentstatusrefunded() {

        PaymentstatusRefunded.click();
    }

    public void SetPaymentstatuspartialrefunded() {

        PaymentstatusPartiallyRefunded.click();
    }

    public void ClickBookingManagement() {
        Bookingmanagement.click();

    }
}
