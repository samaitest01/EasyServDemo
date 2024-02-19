package com.easyserv.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;

    public Login(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "email")
    public WebElement TestEmail;
    @FindBy(id = "password")
    public WebElement TestPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ButtonSignIn;
    @FindBy(xpath = "//input[@id='serviceCentre']")
    public WebElement DropdownElement;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement NextButton;
    @FindBy(xpath = "//div[contains(text(),'Global')]")
    public WebElement GlobalElement;
    @FindBy(xpath = "//span[@class='ant-avatar ant-avatar-circle']")
    public WebElement LogoutAvatar;
    @FindBy(xpath = "//div[normalize-space()='Logout']")
    public WebElement LogoutButton;

}

