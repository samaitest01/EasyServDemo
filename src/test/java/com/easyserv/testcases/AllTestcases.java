package com.easyserv.testcases;

import com.easyserv.selenium.Base;
import org.testng.annotations.Test;

import java.util.logging.Filter;

public class AllTestcases extends Base {

    TC_001_Login login = new TC_001_Login();
    TC_002_CustomerSearch CustomerSearch = new TC_002_CustomerSearch();
    TC_003_SortCustomer SortCustomer = new TC_003_SortCustomer();
    TC_004_FilterCustomer FilterCustomer = new TC_004_FilterCustomer();
    TC_005_BookingManagement_ChangeView BookingManagement = new TC_005_BookingManagement_ChangeView();
    TC_006_BookingManagement_ListView BookingManagementList = new TC_006_BookingManagement_ListView();
    TC_007_BookingManagement_Filter BookingManagementFilter = new TC_007_BookingManagement_Filter();

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        login.loginTest();
        Parent = reports.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Test(priority = 2)
    public void CustomerSearch() throws InterruptedException {
        CustomerSearch.customersearch();
        Parent = reports.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Test(priority = 3)
    public void SortCustomer() throws InterruptedException {

        SortCustomer.SortCustomer();
        Parent = reports.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Test(priority = 4)
    public void FilterCustomer() throws InterruptedException {

        FilterCustomer.Filtercustomer();
        Parent = reports.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Test(priority = 5)
    public void ChangeView() throws InterruptedException {

        BookingManagement.bookingmanagement();
        Parent = reports.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Test(priority = 6)
    public void BookingManagementListView() throws InterruptedException {

        BookingManagementList.calenderview();
        Parent = reports.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Test(priority = 7)
    public void Filter() throws InterruptedException {

        BookingManagementFilter.FilterBookingView();
        Parent = reports.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }
}