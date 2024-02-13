package com.easyserv.functions;

import com.easyserv.pageobject.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Loginfunction extends Login {
    WebDriver driver;
    public Loginfunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void loginmethod(String emailID, String password) throws InterruptedException
    {
        txtemail.sendKeys(emailID);
        txtpwd.sendKeys(password);
        btnsignin.click();
        dropdownElement.click();
        GlobalElement.click();
        Nextbtn.click();

    }
    public void logoutmethod() throws InterruptedException {
        Thread.sleep(3000);
        LogoutAvatar.click();
        Thread.sleep(3000);
        logoutbtn.click();
    }


}
