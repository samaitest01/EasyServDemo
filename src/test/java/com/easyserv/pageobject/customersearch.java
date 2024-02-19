package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class customersearch {

    WebDriver driver;

    public customersearch(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Customer Management']")
    public WebElement customermngt;
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchcst;
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button']")
    public WebElement searchbtn;



}

