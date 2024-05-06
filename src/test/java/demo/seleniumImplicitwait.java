package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googlesearchpage;

public class seleniumImplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	
	public static void test() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement textBox = driver.findElement(By.id("APjFqb"));		
  		textBox.sendKeys("Will do automation");
  		
  		
  		googlesearchpage.textbox_search(driver).sendKeys("step by step automation");
  		WebElement textBox1 = driver.findElement(By.id("APjFqb"));		
		textBox1.sendKeys("Will do automation");
		driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).click();
		
		
		
	}

}
