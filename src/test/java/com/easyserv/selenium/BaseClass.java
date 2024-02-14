package com.easyserv.selenium;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.easyserv.pageobject.Login;
import com.easyserv.pageobject.UpdateReports;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {
     public ExtentSparkReporter spark;
    public ExtentTest Parent;
    public ExtentTest test;
    public  ExtentReports reports;
    public String URL= "https://osb-admin-staging.siliconstack.com.au/login";
    public String UserName = "admin1@example.com";
    public String Password = "12345678";
    public  WebDriver driver;
    public  String fileDestination = "C:\\Users\\Austraxpc59\\IdeaProjects\\EasyServDemo\\Utilities";
UpdateReports updateReports = new UpdateReports();
  public  String REPORT_PATH = fileDestination+"\\ExtentReport\\extent.html";
    @BeforeClass
    public void Setup()

    {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentReportCreating();



    }
    @AfterClass
    public void exit()
    {
     reports.flush();
     driver.quit();

    }
    public  void captureScreenshot(WebDriver driver, String methodName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Generate a unique filename using timestamp
            SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");
            String timestamp = dateFormat.format(new Date());

           String destinationPath = fileDestination+"\\Screenshots\\" + methodName + "_" + timestamp + ".png";
            File destination = new File(destinationPath);
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot captured: " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void extentReportCreating(){
    reports = new ExtentReports();
    spark = new ExtentSparkReporter(REPORT_PATH);
    reports.attachReporter(spark);
    spark.config().setReportName(new Object(){}.getClass().getEnclosingMethod().getName());
    spark.config().setDocumentTitle(new Object(){}.getClass().getEnclosingMethod().getName());
    spark.config().setTheme(Theme.STANDARD);
    reports.setSystemInfo("Project Name", "EasyServ");
    reports.setSystemInfo("Device OS", System.getProperty("os.name"));
    reports.setSystemInfo("System OS", System.getProperty("os.name") + "@" + System.getProperty("os.version") + "@"
            + System.getProperty("os.arch"));
    Parent= reports.createTest("Test Login");
    test =Parent.createNode("Test");

}



}
