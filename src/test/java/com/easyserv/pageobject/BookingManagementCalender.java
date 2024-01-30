package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingManagementCalender {


    WebDriver driver;

    public BookingManagementCalender(WebDriver rdriver)
    {
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Booking Management']")
    WebElement Bookingmanagement;
    @FindBy(xpath = "//button[normalize-space()='day']") WebElement DayView;
    @FindBy(xpath = "//button[normalize-space()='week']") WebElement WeekView;
    @FindBy(xpath = "//button[normalize-space()='month']") WebElement MonthView;
    @FindBy(xpath = "//input[@value='list']") WebElement Calenderview;
    @FindBy(xpath = "//span[@aria-label='filter']") WebElement Filterbutton;
    @FindBy(xpath = "//input[@id='rc_select_68']") WebElement FilterByAll;
    @FindBy(xpath = "//div[contains(text(),'Booked In')]") WebElement FilterBookedin;
    @FindBy(xpath = "//div[contains(text(),'Checked In')]") WebElement FilterCheckedIn;
    @FindBy(xpath = "//div[contains(text(),'Completed')]") WebElement FilterCompleted;
    @FindBy(xpath = "//div[contains(text(),'Cancelled')]") WebElement FilterCancelled;
    @FindBy(xpath = "//span[@title='All Status']") WebElement Paymentstatus;
    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Paid']") WebElement PaymentstatusPaid;
    @FindBy(xpath = "//div[contains(text(),'Not Paid')]") WebElement PaymentstatusNotPaid;
    @FindBy(xpath = "//div[contains(text(),'Refunded')]") WebElement PaymentstatusRefunded;
    @FindBy(xpath = "//div[contains(text(),'Partially Refunded')]") WebElement PaymentstatusPartiallyRefunded;
    @FindBy(xpath = "//span[normalize-space()='Apply']") WebElement FilterApply;
    @FindBy(xpath = "//span[normalize-space()='Clear all']") WebElement FilterClearAll;

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








}
