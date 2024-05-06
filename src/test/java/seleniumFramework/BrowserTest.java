package seleniumFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		//String geckopath= System.getProperty("user.dir");
		
		//System.setProperty("webdriver.chrome.driver", "D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.firefox.driver", "D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		driver.get("https://google.com/");
		WebElement textBox = driver.findElement(By.id("APjFqb"));		
		textBox.sendKeys("Will do automation");
		driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).click();
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("Size of google search element is:"+count);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
