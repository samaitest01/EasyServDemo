package com.easyserv.functions;

import com.easyserv.pageobject.Login;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Loginfunction extends Login {
    WebDriver driver;
    public Loginfunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void loginmethod(String emailID, String password) throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        txtemail.sendKeys(emailID);
        txtpwd.sendKeys(password);
        btnsignin.click();
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
