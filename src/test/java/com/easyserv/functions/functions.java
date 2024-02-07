package com.easyserv.functions;
import com.easyserv.pageobject.BookingManagementCalender;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class functions extends BookingManagementCalender{
    WebDriver driver;
    public functions(WebDriver rdriver) {
        super(rdriver);
    }

    public void setlistview() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Listview.click();
        Thread.sleep(3000);

    }
    public void setFilterbutton()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Filterbutton.click();
    }
    public void SetFilterAll()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FilterByAll.click();
    }
    public void SetFilterBookedin()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FilterBookedin.click();
    }
    public void SetFilterCheckedIn()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FilterCheckedIn.click();
    }
    public void SetFilterCompleted()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FilterCompleted.click();
    }
    public void SetFiltercancelled()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FilterCancelled.click();
    }
    public void SetApplyFilter()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ApplyFilter.click();
    }
    public void SetClearAll()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FilterClearAll.click();
    }
    public void Setpaymentstatus()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Paymentstatus.click();
    }
    public void SetPaymentstatuspaid()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PaymentstatusPaid.click();
    }
    public void SetPaymentstatusnotpaid()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PaymentstatusNotPaid.click();
    }
    public void SetPaymentstatusrefunded()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PaymentstatusRefunded.click();
    }
    public void SetPaymentstatuspartialrefunded()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PaymentstatusPartiallyRefunded.click();
    }
    public void ClickBookingManagement() throws InterruptedException {
        Bookingmanagement.click();
        Thread.sleep(3000);
    }
}
