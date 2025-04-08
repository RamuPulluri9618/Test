package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Baseclass {

	public WebDriver driver;
	
	public static ExtentReports extent;
    public static ExtentTest test;
    


	ExtentSparkReporter extentSparkReporter;
	

	@BeforeSuite
	public void startReporter() {
		extentSparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "/test-output/extentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(extentSparkReporter);

		// configuration items to change the look and feel
		// add content, manage tests etc
		extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
		extentSparkReporter.config().setReportName("Test Report");
		extentSparkReporter.config().setTheme(Theme.STANDARD);
		extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	@AfterSuite
	public void afterSuite() {
		
		extent.flush();
	}
	@BeforeMethod
	public void launchbrowser() {

		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//extentReports = new ExtentReports();
	}

//	@AfterTest
//	public void teardown() {
//		driver.close();
//	}

	@AfterMethod
	public void getResult(ITestResult result) {
		driver.close();
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getTestName());
		} else {
			test.log(Status.SKIP, result.getTestName());
		}
	}
}
