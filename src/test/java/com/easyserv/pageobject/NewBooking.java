package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewBooking {



    protected WebDriver driver;

    public NewBooking(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'New Booking')]")
    public WebElement NewBooking;
    @FindBy(xpath = "//input[@id='searchCustomerText']")
    public WebElement CustomerSearchTest;

    @FindBy(xpath = "//div[normalize-space()='trung.truong@siliconstack.com.au | 04 1111 1111 | 123456']")
    public WebElement CustomerName;
    @FindBy(xpath = "//span[@aria-label='search']//*[name()='svg']")
    public WebElement CustomerSearchButton;



    @FindBy(xpath = "//span[normalize-space()='Next']")
    public WebElement NextButton ;

    @FindBy(xpath = "//span[contains(text(),'Service')]")
    public WebElement BookingDetailsService;

    @FindBy(xpath = "//strong[normalize-space()='+ Add item']")
    public WebElement AddItem;

    @FindBy(xpath = "//div[contains(text(),'Essential Service')]")
    public WebElement AddItemService ;

    @FindBy(xpath = "(//textarea[@placeholder='Leave a note here'])[1]")
    public WebElement AddNotes ;


    @FindBy(xpath = "//input[@placeholder='Select date']")
    public WebElement SelectDate;

    @FindBy(xpath = "//span[@class='ant-select-selection-placeholder']")
    public WebElement SelectTime ;

    @FindBy(xpath = "//span[@title='10:00']")
    public WebElement SelectTime10;








}
