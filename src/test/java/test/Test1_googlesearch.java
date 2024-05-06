package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_googlesearch {
          public static void main(String[] args) {
			googlesearch();
		}
          
          public static void googlesearch() {
        	  
        	//System.setProperty("webdriver.chrome.driver", "D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
        	  
        	  WebDriver driver = new ChromeDriver();
        	  driver.get("https://google.com");
      		WebElement textBox = driver.findElement(By.id("APjFqb"));		
      		textBox.sendKeys("Will do automation");
      		//driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).click();
            driver.findElement((By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']"))).sendKeys(Keys.RETURN);
        	  System.out.println("test case case completed:");
        	  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 driver.close();
          }
          
}
