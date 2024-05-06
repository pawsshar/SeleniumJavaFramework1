package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Propertiesfile;

public class Test1_googlesearch_TestNG_Demo {
	WebDriver driver = null;
	public static String browserName=null;
	private static Logger logger= LogManager.getLogger("Log4j_Demo");
	
	@BeforeTest
	public void setUpTest() {
		
		Propertiesfile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver","D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");  
				driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		logger.info("Browser started");
	}
		
//	   System.setProperty("webdriver.chrome.driver","D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");  
//		driver = new ChromeDriver();
	}
	      @Test
          public void googlesearch() {
        	  
        	//System.setProperty("webdriver.chrome.driver", "D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
        	  
        	  
        	  driver.get("https://google.com");
      		WebElement textBox = driver.findElement(By.id("APjFqb"));		
      		textBox.sendKeys("Will do automation");
      		//driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).click();
            driver.findElement((By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']"))).sendKeys(Keys.RETURN);
        	 
        	  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
          }
         @AfterTest
          public void downtest() {
        	  
        	  driver.close();
        	 // driver.quit();
        	  System.out.println("test case case completed:");
          }
}
