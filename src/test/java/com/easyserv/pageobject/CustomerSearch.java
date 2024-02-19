package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerSearch {

    WebDriver driver;

    public CustomerSearch(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Customer Management']")
    public WebElement CustomerManagement;
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement SearchCustomer;
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button']")
    public WebElement SearchButton;



}

