package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class sortcustomer {

    WebDriver ldriver;

    public sortcustomer(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
        ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @FindBy(xpath = "//span[normalize-space()='Customer Name']")WebElement sortbyname;
    @FindBy(xpath = "//span[normalize-space()='Phone Number']") WebElement sortbyphone;
    @FindBy(xpath = "//span[normalize-space()='Email']")WebElement getSortbyemail;

    public void setSortbyname()
    {sortbyname.click();}
    public void setSortbyphone()
    {sortbyphone.click();}
    public void setGetSortbyemail()
    {getSortbyemail.click();}
}