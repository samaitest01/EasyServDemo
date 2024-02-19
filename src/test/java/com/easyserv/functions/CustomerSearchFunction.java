package com.easyserv.functions;

import com.easyserv.pageobject.customersearch;
import org.openqa.selenium.WebDriver;

public class CustomerSearchFunction extends customersearch {


    public CustomerSearchFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void setCustomerMngt() {
        customermngt.click();
    }

    public void setSearchCst(String name) {
        searchcst.sendKeys(name);
    }

    public void setSearchBtn() {

        searchbtn.click();
    }
}
