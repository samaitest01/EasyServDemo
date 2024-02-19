package com.easyserv.functions;

import com.easyserv.pageobject.BookingCalender;
import org.openqa.selenium.WebDriver;

public class BookingCalenderFunction extends BookingCalender {
    WebDriver driver;

    public BookingCalenderFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void setListView() throws InterruptedException {
        Thread.sleep(3000);
        ListView.click();
        Thread.sleep(3000);

    }

    public void setFilterButton() {
        FilterButton.click();
    }

    public void SetFilterAll() {
        FilterByAll.click();
    }

    public void SetFilterBookedin() {

        FilterBookedIn.click();
    }

    public void SetFilterCheckedIn() throws InterruptedException {
        Thread.sleep(3000);
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

        PaymentStatus.click();
    }

    public void SetPaymentStatusPaid() {

        PaymentStatusPaid.click();
    }

    public void SetPaymentStatusnotPaid() {

        PaymentStatusNotPaid.click();
    }

    public void SetPaymentStatusRefunded() {

        PaymentStatusRefunded.click();
    }

    public void SetPaymentStatusPartialRefunded() {
        PaymentstatusPartiallyRefunded.click();
    }

    public void ClickBookingManagement() throws InterruptedException {
        BookingManagement.click();

    }

    public void setChangeView() throws InterruptedException {

        Thread.sleep(3000);
        BookingManagement.click();
        Thread.sleep(3000);
        DayView.click();
        Thread.sleep(3000);
        WeekView.click();
        Thread.sleep(3000);
        MonthView.click();

    }


}
