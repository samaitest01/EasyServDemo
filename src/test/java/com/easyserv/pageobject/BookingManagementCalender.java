package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BookingManagementCalender {


    WebDriver driver;

    public BookingManagementCalender(WebDriver rdriver)
    {
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Booking Management']")public
    WebElement Bookingmanagement;
    @FindBy(xpath = "//button[normalize-space()='day']")public WebElement DayView;
    @FindBy(xpath = "//button[normalize-space()='week']") public WebElement WeekView;
    @FindBy(xpath = "//button[normalize-space()='month']") public WebElement MonthView;
    @FindBy(xpath = "//span[@aria-label='unordered-list']//*[name()='svg']")
    public WebElement Listview;
    @FindBy(xpath = "//span[@aria-label='filter']") public WebElement Filterbutton;
    @FindBy(xpath = "//div[@data-label='Status']//span[@title='All Status'][normalize-space()='All Status']")public WebElement FilterByAll;
    @FindBy(xpath = "//div[contains(text(),'Booked In')]") public WebElement FilterBookedin;
    @FindBy(xpath = "//div[contains(text(),'Checked In')]") public WebElement FilterCheckedIn;
    @FindBy(xpath = "//div[contains(text(),'Completed')]") public WebElement FilterCompleted;
    @FindBy(xpath = "//div[contains(text(),'Cancelled')]") public  WebElement FilterCancelled;
    @FindBy(xpath = "//span[@title='All Status']") public  WebElement Paymentstatus;
    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Paid']") public  WebElement PaymentstatusPaid;
    @FindBy(xpath = "//div[contains(text(),'Not Paid')]") public  WebElement PaymentstatusNotPaid;
    @FindBy(xpath = "//div[contains(text(),'Refunded')]") public  WebElement PaymentstatusRefunded;
    @FindBy(xpath = "//div[contains(text(),'Partially Refunded')]") public  WebElement PaymentstatusPartiallyRefunded;
    @FindBy(xpath = "//span[normalize-space()='Apply']") public  WebElement ApplyFilter;
    @FindBy(xpath = "//span[normalize-space()='Clear all']") public  WebElement FilterClearAll;

/*
    public void ClickBookingManagement() throws InterruptedException {
        Bookingmanagement.click();
        Thread.sleep(3000);

    }
    public void setChangeView() throws InterruptedException {
        Bookingmanagement.click();
        Thread.sleep(3000);
        DayView.click();
        Thread.sleep(3000);
        WeekView.click();
        Thread.sleep(3000);
        MonthView.click();
        Thread.sleep(3000);
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
    }*/







}
