package com.easyserv.functions;

import com.easyserv.pageobject.FilterCustomerList;
import org.openqa.selenium.WebDriver;

public class FilterCustomerListFunction extends FilterCustomerList {

    public FilterCustomerListFunction(WebDriver rdriver) {
        super(rdriver);
    }

    public void setFilterActive() throws InterruptedException {

        FilterLabel.click();
        StatusDropdown.click();
        FilterActive.click();
    }

    public void setFilterInActive() throws InterruptedException {

        FilterLabel.click();
        StatusDropdown.click();
        FilterInActive.click();
        ApplyFilter.click();

    }
}
