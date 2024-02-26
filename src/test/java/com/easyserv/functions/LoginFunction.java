package com.easyserv.functions;

import com.easyserv.pageobject.Login;
import org.openqa.selenium.WebDriver;

public class LoginFunction extends Login {
    WebDriver driver;
    boolean testCaseStatus;

    public LoginFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void LoginMethod(String emailID, String password) {

        TestEmail.sendKeys(emailID);
        TestPassword.sendKeys(password);
        ButtonSignIn.click();
        DropdownElement.click();
        GlobalElement.click();
        NextButton.click();

    }

    public void logoutmethod()
    {
            LogoutAvatar.click();
        LogoutButton.click();
        testCaseStatus = true;
    }
}
