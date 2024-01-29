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



}
