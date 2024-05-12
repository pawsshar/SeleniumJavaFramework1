package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUpHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co/");
		driver.findElement(By.xpath("//span[@class='login_click login-vd giTrackElementHeader ']")).click();
		driver.findElement(By.id("si_popup_email")).sendKeys("hariom98756@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("Pawan05q@1234");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='img30']")).click();
		
		//driver.get("<"a href="https://learning.edureka.co/onboarding/personaldetails">");
			driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//i[@class='icon-camera']")).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
//		   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		
		//	Thread.sleep(5000);
			// alert=driver.switchTo().alert();		
			//alert.dismiss(); 
			Thread.sleep(2000);
		WebElement chooseFile =driver.findElement(By.xpath("//input[@id='custom-input']"));
		
		chooseFile.sendKeys("D:\\education.jpeg");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
		

	}

}
