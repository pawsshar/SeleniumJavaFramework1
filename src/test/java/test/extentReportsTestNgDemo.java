package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportsTestNgDemo {
    
	WebDriver driver;
	
	private static ExtentHtmlReporter htmlreporter = null;
	private static ExtentReports extent = null;
			
	@BeforeSuite
	public void setup() {
		
		htmlreporter= new ExtentHtmlReporter("testNgReporter.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		 System.setProperty("webdriver.chrome.driver","D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");  
		 driver = new ChromeDriver();

	}

	@Test
	public void test() throws Exception {
        

		
		//need to initialize object of extent and htmlreporter 
		ExtentTest test = extent.createTest("Google search Test One","This is test to validate google search functionality");
		
		driver.get("https://google.com");
		test.pass("goto google page");	 
		test.log(Status.INFO, "Usage of file");
		
		//info details
		test.info("info");
		
		
		//pass the case
//		test.pass("pass the case");
//		
		//fail the case
		
		
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		
		test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
     public void downtest() {
   	  
   	  driver.close();
   	  driver.quit();
   	  System.out.println("test case case completed:");
     }


	@AfterSuite
	public void laststep() {

		extent.flush();

	}



}
