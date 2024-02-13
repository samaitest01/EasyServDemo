package com.easyserv.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Filtercustomerlist {


    WebDriver driver;

    public Filtercustomerlist(WebDriver rdriver)
    {
        driver = rdriver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-lg ant-btn-icon-only']")
    WebElement filtericon;

    @FindBy(xpath = "//span[@aria-label='filter']") WebElement Filterlabel;
    @FindBy(xpath = "//span[@title='All']") WebElement statusdropdown;
    @FindBy(xpath = "//div[contains(text(),'Active')]")WebElement FilterActive;
    @FindBy(xpath = "//div[contains(text(),'Inactive')]")WebElement FilterInActive;
    @FindBy(xpath = "//span[normalize-space()='Apply']")WebElement ApplyFilter;

    public void setFilterActive() throws InterruptedException {

        Filterlabel.click();
        statusdropdown.click();
        FilterActive.click();
    }
    public void setFilterInActive() throws InterruptedException {

       Filterlabel.click();
       statusdropdown.click();
       FilterInActive.click();
       ApplyFilter.click();

    }

}
