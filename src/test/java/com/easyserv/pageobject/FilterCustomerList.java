package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class FilterCustomerList {


    WebDriver driver;

    public FilterCustomerList(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-lg ant-btn-icon-only']")
    public WebElement FilterIcon;

    @FindBy(xpath = "//span[@aria-label='filter']")
    public WebElement FilterLabel;
    @FindBy(xpath = "//span[@title='All']")
    public WebElement StatusDropdown;
    @FindBy(xpath = "//div[contains(text(),'Active')]")
    public WebElement FilterActive;
    @FindBy(xpath = "//div[contains(text(),'Inactive')]")
    public WebElement FilterInActive;
    @FindBy(xpath = "//span[normalize-space()='Apply']")
    public WebElement ApplyFilter;


}
