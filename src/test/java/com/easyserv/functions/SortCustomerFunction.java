package com.easyserv.functions;

import com.easyserv.pageobject.SortCustomer;
import org.openqa.selenium.WebDriver;

public class SortCustomerFunction extends SortCustomer {


    public SortCustomerFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void setSortbyname() {
        DortByName.click();
    }

    public void setSortbyphone() {
        SortByPhone.click();
    }

    public void setGetSortbyemail() {
        SortByEmail.click();
    }
}
