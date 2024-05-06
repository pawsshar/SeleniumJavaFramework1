package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo3 {
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		
	   System.setProperty("webdriver.chrome.driver","D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");  
		driver = new ChromeDriver();
	}
	      @Test
          public void googlesearch2() {
        	  
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
	      @Test
	      public void googlesearch3() {
        	  
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
        	  driver.quit();
        	  System.out.println("test case case completed:");
          }
}
