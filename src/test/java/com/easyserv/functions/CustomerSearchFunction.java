package com.easyserv.functions;

import com.easyserv.pageobject.CustomerSearch;
import org.openqa.selenium.WebDriver;

public class CustomerSearchFunction extends CustomerSearch {


    public CustomerSearchFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void setCustomerMngt() {
        CustomerManagement.click();
    }

    public void setSearchCst(String name) {
        SearchCustomer.sendKeys(name);
    }

    public void setSearchBtn() {

        SearchButton.click();
    }
}
