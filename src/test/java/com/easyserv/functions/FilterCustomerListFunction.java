package com.easyserv.functions;

import com.easyserv.pageobject.FilterCustomerList;
import org.openqa.selenium.WebDriver;

public class FilterCustomerListFunction extends FilterCustomerList {

    public FilterCustomerListFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void setFilterActive() throws InterruptedException {

        Thread.sleep(5000);
        FilterLabel.click();
        Thread.sleep(5000);
        StatusDropdown.click();
        FilterActive.click();
    }

    public void setFilterInActive() throws InterruptedException {


        FilterLabel.click();
        Thread.sleep(30000);
        StatusDropdown.click();
        Thread.sleep(30000);
        FilterInActive.click();
        ApplyFilter.click();

    }
}
