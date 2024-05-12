package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlesPopUp {

	public static void main(String[] args) throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		//driver.findElement(By.xpath("$(\"body > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(2) > font:nth-child(1) > a:nth-child(3)\")")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator it =handler.iterator();
		
		String parentWindows =(String) it.next();
		System.out.println("parent window id is" +parentWindows);
		
		String childWindows =(String) it.next();
		System.out.println("child window id is" +childWindows);
		
		String childWindows1 =(String) it.next();
		System.out.println("child window id is" +childWindows1);
		
		String childWindows2 =(String) it.next();
		System.out.println("child window id is" +childWindows2);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childWindows);
		
		System.out.println("The tittle of child window is" +driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		//driver.switchTo().window(parentWindows);
		
		//Thread.sleep(2000);
		
		driver.switchTo().window(childWindows1);
		System.out.println("The tittle of child window is" +driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
       // driver.switchTo().window(parentWindows);
        
        //Thread.sleep(2000);
		
		driver.switchTo().window(childWindows2);
		System.out.println("The tittle of child window is" +driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindows);
		System.out.println("The tittle of parent window is" +driver.getTitle());

	}

}
