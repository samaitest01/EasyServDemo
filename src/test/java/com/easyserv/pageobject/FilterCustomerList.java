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
    WebElement FilterIcon;

    @FindBy(xpath = "//span[@aria-label='filter']")
    WebElement FilterLabel;
    @FindBy(xpath = "//span[@title='All']")
    WebElement StatusDropdown;
    @FindBy(xpath = "//div[contains(text(),'Active')]")
    WebElement FilterActive;
    @FindBy(xpath = "//div[contains(text(),'Inactive')]")
    WebElement FilterInActive;
    @FindBy(xpath = "//span[normalize-space()='Apply']")
    WebElement ApplyFilter;

    public void setFilterActive() throws InterruptedException {

        FilterLabel.click();
        StatusDropdown.click();
        FilterActive.click();
    }

    public void setFilterInActive() throws InterruptedException {

        FilterLabel.click();
        StatusDropdown.click();
        FilterInActive.click();
        ApplyFilter.click();

    }

}
