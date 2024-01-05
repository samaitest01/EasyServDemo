package com.easyserv.pageobject;

import org.jsoup.select.Evaluator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.naming.Name;
import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login
{

    WebDriver ldriver;

    public Login(WebDriver rdriver)
    {

        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
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

    public void setTxtemail(String email) {
        txtemail.sendKeys(email);
    }

    public void setTxtpwd(String pwd) {
        txtpwd.sendKeys(pwd);

    }

    public void setBtnsignin(){
        btnsignin.click();
    }



    public void setStore() throws InterruptedException
    {
        ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dropdownElement.click();
        GlobalElement.click();

    }
      public void setNextbtn ()
      {
         Nextbtn.click();
      }


    }