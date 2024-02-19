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
        BookingManagement.click();

        DayView.click();

        WeekView.click();

        MonthView.click();

    }


}
