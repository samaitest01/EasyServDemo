package com.easyserv.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;

    public Login(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "email")
    public WebElement txtemail;
    @FindBy(id = "password")
    public WebElement txtpwd;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnsignin;
    @FindBy(xpath = "//input[@id='serviceCentre']")
    public WebElement dropdownElement;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Nextbtn;
    @FindBy(xpath = "//div[contains(text(),'Global')]")
    public WebElement GlobalElement;
    @FindBy(xpath = "//span[@class='ant-avatar ant-avatar-circle']")
    public WebElement LogoutAvatar;
    @FindBy(xpath = "//div[normalize-space()='Logout']")
    public WebElement logoutbtn;

}

