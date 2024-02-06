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
    WebElement txtemail;
    @FindBy(id = "password")
    WebElement txtpwd;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnsignin;
    @FindBy(xpath = "//input[@id='serviceCentre']")
    WebElement dropdownElement;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Nextbtn;
    @FindBy(xpath = "//div[contains(text(),'Global')]")
    WebElement GlobalElement;
    @FindBy(xpath = "//span[@class='ant-avatar ant-avatar-circle']")
    WebElement LogoutAvatar;
    @FindBy(xpath = "//div[normalize-space()='Logout']")
    WebElement logoutbtn;

    public void loginmethod(String emailID, String password) throws InterruptedException
    {
        txtemail.sendKeys(emailID);
        txtpwd.sendKeys(password);
        btnsignin.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dropdownElement.click();
        GlobalElement.click();
        Nextbtn.click();

    }
    public void logoutmethod()
    {
        LogoutAvatar.click();
        logoutbtn.click();
    }
}
