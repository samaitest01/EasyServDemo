package com.easyserv.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortCustomer {

    WebDriver driver;

    public SortCustomer(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Customer Name']")
    WebElement DortByName;
    @FindBy(xpath = "//span[normalize-space()='Phone Number']")
    WebElement SortByPhone;
    @FindBy(xpath = "//span[normalize-space()='Email']")
    WebElement SortByEmail;

    public void setSortbyname() {
        DortByName.click();
    }

    public void setSortbyphone() {
        SortByPhone.click();
    }

    public void setGetSortbyemail() {
        SortByEmail.click();
    }
}
