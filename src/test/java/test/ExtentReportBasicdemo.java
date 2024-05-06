package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.googlesearchpage;

public class ExtentReportBasicdemo implements st1 {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		 
		 //create extent report and attach
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);
		 
		 //create a toggle for extent test, add all log events
		 ExtentTest test1= extent.createTest("Google search Test One","This is test to validate google search functionality");
		 System.setProperty("webdriver.chrome.driver","D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");  
		 driver = new ChromeDriver();
         test1.log(Status.INFO, "Starting test case");
         
		 driver.get("https://google.com");
         test1.pass("Goto google.com");
         
		 googlesearchpage.textbox_search(driver).sendKeys("step by step automation");
		 test1.pass("Enter test in google search box");
		 
		 googlesearchpage.search_button(driver).sendKeys(Keys.RETURN);
		 test1.pass("Press search button");

		 driver.close();
		 driver.quit();
		 test1.pass("Driver is closed");
		 
		 test1.pass("Test is completed");
		 
		 //calling flush  here because it writes everything to the log file
		 extent.flush();		 
	}

}
