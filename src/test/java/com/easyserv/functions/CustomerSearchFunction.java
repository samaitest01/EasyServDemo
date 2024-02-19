package com.easyserv.functions;

import com.easyserv.pageobject.CustomerSearch;
import org.openqa.selenium.WebDriver;

public class CustomerSearchFunction extends CustomerSearch {


    public CustomerSearchFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void setCustomerManagement() {
        CustomerManagement.click();
    }

    public void setSearchCustomer(String name) {
        SearchCustomer.sendKeys(name);
    }

    public void setSearchButton() {

        SearchButton.click();
    }
}
