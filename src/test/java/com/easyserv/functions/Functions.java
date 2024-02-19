package com.easyserv.functions;

import com.easyserv.pageobject.BookingManagementCalender;
import org.openqa.selenium.WebDriver;

public class Functions extends BookingManagementCalender {
    WebDriver driver;

    public Functions(WebDriver rdriver) {
        super(rdriver);
    }

    public void setlistview() throws InterruptedException {

        ListView.click();


    }

    public void setFilterbutton() {

        FilterButton.click();
    }

    public void SetFilterAll() {

        FilterByAll.click();
    }

    public void SetFilterBookedin() {

        FilterBookedIn.click();
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

        PaymentStatus.click();
    }

    public void SetPaymentstatuspaid() {

        PaymentStatusPaid.click();
    }

    public void SetPaymentstatusnotpaid() {

        PaymentStatusNotPaid.click();
    }

    public void SetPaymentstatusrefunded() {

        PaymentStatusRefunded.click();
    }

    public void SetPaymentstatuspartialrefunded() {

        PaymentstatusPartiallyRefunded.click();
    }

    public void ClickBookingManagement() {
        BookingManagement.click();

    }
}
