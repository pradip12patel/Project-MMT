package Project1Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClassMMT {
	
	public WebDriver driver;
	Properties pro;
	
	public void DriverInitilize() throws IOException   {
		
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Project1\\java\\data.properties");
		
	    pro=new Properties();
		pro.load(file);
		
		String key=pro.getProperty("browser");
		
		if(key.equalsIgnoreCase("firefox"))  {
			
		      driver=new FirefoxDriver();
		}	
			else if(key.equalsIgnoreCase("chrome"))  {
				
				 ChromeOptions op=new ChromeOptions();
			      op.addArguments("--remote-allow-origins=*"); 
		    	  
		    	 driver=new ChromeDriver(op); 
			}
			else {
				System.out.println("plz check the browser");
			}
			
		}
		
	    @BeforeMethod
		public void openurl() throws IOException   {
			
			DriverInitilize();
			
			String key1=pro.getProperty("url");
			driver.get(key1);
		}
		@AfterMethod
		public void maxiwindow()   {
			
			driver.quit();
		}
	}


