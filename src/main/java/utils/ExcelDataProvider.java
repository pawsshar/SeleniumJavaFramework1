package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class ExcelDataProvider {
	
	static WebDriver driver=null;
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		
		
			 System.setProperty("webdriver.chrome.driver","D:\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");  
				driver = new ChromeDriver();
	
	}

	@Test(dataProvider="testdata1")
	public void test1(String username, String password) throws Exception {
		
		System.out.println(username+"|"+password);
		driver.get("https://hrms.webpayroll.in/Gameium/Login_comm1.aspx");	
		driver.findElement(By.xpath("//input[@id='txtusename']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtpassword']")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	//we need to provide data using testNG, for we need to create new function
	
	   @DataProvider(name = "testdata1")
       public Object[][] getData() {
		   String excelPath="D:\\seleniumFramework\\excel\\data.xlsx";
		   //call excel data with excel and sheet name
		   
		  Object data[][]= testData(excelPath,"Sheet1");
		  return data;
       }  
	

	public Object[][] testData(String excelPath, String sheetName) {
		
		Excelutils excel = new Excelutils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		//we have to define object in array
		
		Object data[][]= new Object[rowCount-1][colCount];
		
		//to print the data we need to use for loop for that for inside for
		
		for(int i=1; i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				
				String cellData =excel.getCellDataString(i, j);
				//System.out.println(cellData+" | ");
				data[i-1][j]= cellData;
				
			}
			//System.out.println();
		}
		return data;
		
	}





}
