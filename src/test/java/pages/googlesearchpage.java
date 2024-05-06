package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpage {
	
	private static WebElement element=null;

	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static WebElement search_button(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']"));
		return element;
		
	}
}
