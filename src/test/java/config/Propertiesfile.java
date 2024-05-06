package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Test1_googlesearch_TestNG_Demo;

public class Propertiesfile {

	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this will help to execute in config file order
           getProperties();
           setProperties();
           getProperties();
	}

	public static void getProperties() {
		//try catch is used to create a scenerio that if we insert chrome in 
		try {
		
		
		InputStream input = new FileInputStream("D:\\seleniumFramework\\src\\test\\java\\config\\config.properties");
		//we have to load file so it can take input from config
		prop.load(input);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		//we are equallizing browser name of this class and testng demo class name
		Test1_googlesearch_TestNG_Demo.browserName=browser;
		
		}
		catch(Exception exp) {
		
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
	}
		
}
	
	public static void setProperties() {
		try {
		OutputStream output= new FileOutputStream("D:\\seleniumFramework\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output, null);
		
		}
		catch(Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
}


