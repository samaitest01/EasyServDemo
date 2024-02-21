package com.easyserv.selenium;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class UpdateReports {
    public static ExtentSparkReporter spark;
    public ExtentTest Parent;
    public ExtentTest test;
    public static ExtentReports reports;


    public static ExtentReports extentReportInitialization(String REPORT_PATH) {
        // setup extent reports
        reports = new ExtentReports();
        spark = new ExtentSparkReporter(REPORT_PATH);
        reports.attachReporter(spark);
        spark.config().setReportName(new Object() {}.getClass().getEnclosingMethod().getName());
        spark.config().setDocumentTitle(new Object() {}.getClass().getEnclosingMethod().getName());
        spark.config().setTheme(Theme.STANDARD);
        reports.setSystemInfo("Project Name", "EasyServ");
        reports.setSystemInfo("Device OS", System.getProperty("os.name"));
        reports.setSystemInfo("System OS", System.getProperty("os.name") + "@" + System.getProperty("os.version") + "@"
                + System.getProperty("os.arch"));
        return reports;
    }



    public void addSystemInfoInReport() {
        reports.setSystemInfo("Project Name", "EasyServ");
        reports.setSystemInfo("Device OS", System.getProperty("os.name"));
        reports.setSystemInfo("System OS", System.getProperty("os.name") + "@" + System.getProperty("os.version") + "@"
                + System.getProperty("os.arch"));
    }

    public void updateExtentTestReport(boolean testStepStatus, ExtentTest test) throws IOException {
        if (testStepStatus) {
            System.out.format("%-30s : %b\n", "Test Step Status", testStepStatus);
            System.out.println(
                    "+-------------------------------------------------------------------------------------------------------+");
            test.pass("Step Passed --> : " + new Object() {
            }.getClass().getEnclosingMethod().getName());
        } else {
            System.out.format("%-30s : %b\n", "Test Step Status", testStepStatus);
            System.out.println(
                    "+-------------------------------------------------------------------------------------------------------+");
            test.fail("Step failed --> : " + new Object() {
            }.getClass().getEnclosingMethod().getName());
        }
    }


}
