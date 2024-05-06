package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Googlesearchpageobject {
	
	WebDriver driver = null;
	By textbox_search = By.id("APjFqb");
	By button_search = By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']");
	
   public Googlesearchpageobject(WebDriver driver1) {
	   driver = driver1;
   }

  public void inputtextingoogletextbox(String Text) {
	  
	  driver.findElement(textbox_search).sendKeys(Text);	
	  
  }
  public void searchtextingoogletextbox() {
  
	  driver.findElement(button_search).click();
  }
}