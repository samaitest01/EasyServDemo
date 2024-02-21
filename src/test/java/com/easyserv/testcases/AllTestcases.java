package com.easyserv.testcases;

import com.easyserv.functions.LoginFunction;
import com.easyserv.functions.SortCustomerFunction;
import com.easyserv.selenium.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllTestcases extends Base {

    TC_001_Login login = new TC_001_Login();
    TC_002_CustomerSearch cust = new TC_002_CustomerSearch();
    TC_003_SortCustomer sort = new TC_003_SortCustomer();
    @Test(priority = 1)
    public void TestCaseNo01() throws InterruptedException {
        login.loginTest();
        Parent= reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test(priority = 2)
    public void TestCaseNo02() throws InterruptedException {
        cust.customersearch();
        Parent= reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName());
    }
    @Test(priority = 3)
    public void TestCaseNo03() throws InterruptedException {

        sort.SortCustomer();
        Parent= reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName());
    }








}
