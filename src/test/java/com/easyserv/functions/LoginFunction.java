package com.easyserv.functions;

import com.easyserv.pageobject.Login;
import org.openqa.selenium.WebDriver;

public class LoginFunction extends Login {
    WebDriver driver;
    boolean testCaseStatus;

    public LoginFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void LoginMethod(String emailID, String password) throws InterruptedException {
        try {
            TestEmail.sendKeys(emailID);
            TestPassword.sendKeys(password);
            ButtonSignIn.click();
            DropdownElement.click();
            GlobalElement.click();
            NextButton.click();
            testCaseStatus = true;

        } catch (Exception e) {
            System.out.println("Test Failed due to " + e);
            testCaseStatus = false;
        }
    }

    public boolean logoutmethod() {
        try {

            LogoutAvatar.click();
            LogoutButton.click();
            testCaseStatus = true;
        } catch (Exception e) {
            System.out.println("Test Failed due to " + e);
            testCaseStatus = false;
        }
        return testCaseStatus;
    }


}
