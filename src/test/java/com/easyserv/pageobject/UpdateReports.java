package com.easyserv.pageobject;

import java.io.IOException;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class UpdateReports {
    public ExtentReports reports;
    public ExtentSparkReporter reporter;

    public ExtentSparkReporter extentReportInitialization(String reportName, String REPORT_PATH) {
        // setup extent reports
        String report = REPORT_PATH + "\\Extent.html";
        reports = new ExtentReports();
        reporter = new ExtentSparkReporter(report);
        reports.attachReporter(reporter);
        reporter.config().setReportName(reportName);
        reporter.config().setDocumentTitle(reportName);
        reporter.config().setTheme(Theme.STANDARD);

        return reporter;
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
