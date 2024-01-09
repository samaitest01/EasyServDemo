package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class customersearch {

    WebDriver ldriver;

    public customersearch(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Customer Management']")
    WebElement customermngt;
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchcst;
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button']")
    WebElement searchbtn;

    public void setCustomermngt() {

        customermngt.click();


    }

    public void setSearchcst(String name) {
        ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchcst.sendKeys(name);
    }

    public void setSearchbtn() {
        searchbtn.click();
    }

}

