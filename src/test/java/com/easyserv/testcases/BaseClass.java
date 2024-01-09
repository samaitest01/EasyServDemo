package com.easyserv.testcases;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseClass {
    public String URL= "https://osb-admin-staging.siliconstack.com.au/login";
    public String UserName = "admin1@example.com";
    public String Password = "12345678";
    public static WebDriver driver;

    @BeforeClass
    public static void Setup()

    {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();
         driver.manage().window().maximize();
    }
    @AfterClass
    public static void exit()

    {
       //driver.quit();

    }
    public static void captureScreenshot(WebDriver driver, String methodName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Generate a unique filename using timestamp
            SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");
            String timestamp = dateFormat.format(new Date());

            String destinationPath = "C:\\Users\\Austraxpc59\\IdeaProjects\\EasyServDemo\\Screenshots\\" + methodName + "_" + timestamp + ".png";
            File destination = new File(destinationPath);
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot captured: " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
