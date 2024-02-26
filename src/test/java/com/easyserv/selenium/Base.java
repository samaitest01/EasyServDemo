package com.easyserv.selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Base {
    public ExtentTest Parent;
    public static ExtentReports reports;
    public String URL = "https://osb-admin-staging.siliconstack.com.au/login";
    public String UserName = "admin1@example.com";
    public String Password = "1245678";
    public static WebDriver driver;
    public String fileDestination = "C:\\Users\\Austraxpc59\\IdeaProjects\\EasyServDemo1\\Utilities\\";
    UpdateReports updateReports = new UpdateReports();
    public String REPORT_PATH = fileDestination + "\\ExtentReport\\extent.html";

    @BeforeClass
    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        reports = UpdateReports.extentReportInitialization(REPORT_PATH);

    }
    @AfterClass
    public void exit() {

        reports.flush();
        driver.quit();

    }

    public void captureScreenshot(WebDriver driver, String methodName) {
        try {
            //TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Generate a unique filename using timestamp
            SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");
            String timestamp = dateFormat.format(new Date());

            String destinationPath = fileDestination + "\\Screenshots\\" + methodName + "_" + timestamp + ".png";
            File destination = new File(destinationPath);
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot captured: " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
