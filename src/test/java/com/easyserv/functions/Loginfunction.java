package com.easyserv.functions;

import com.easyserv.pageobject.Login;
import org.openqa.selenium.WebDriver;

public class Loginfunction extends Login {
    WebDriver driver;
    boolean testCaseStatus;

    public Loginfunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void LoginMethod(String emailID, String password) throws InterruptedException {
        try {
            txtemail.sendKeys(emailID);
            txtpwd.sendKeys(password);
            btnsignin.click();
            dropdownElement.click();
            GlobalElement.click();
            Nextbtn.click();
            testCaseStatus = true;

        } catch (Exception e) {
            System.out.println("Test Failed due to " + e);
            testCaseStatus = false;
        }
    }

    public boolean logoutmethod() {
        try {

            LogoutAvatar.click();
            logoutbtn.click();
            testCaseStatus = true;
        } catch (Exception e) {
            System.out.println("Test Failed due to " + e);
            testCaseStatus = false;
        }
        return testCaseStatus;
    }


}
