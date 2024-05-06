package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Googlesearchpageobject;
import pages.googlesearchpage;

public class googlesearchpageTest {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearchtext();
	}

	public static void googlesearchtext() {
		driver = new ChromeDriver();
  	  
		
  	  Googlesearchpageobject googlesearchobj = new Googlesearchpageobject(driver);
  	driver.get("https://google.com");
  	   googlesearchobj.inputtextingoogletextbox("A B C D");
  	   
  	   googlesearchobj.searchtextingoogletextbox();
  	   
  	  driver.close();
	}
	
	
}
