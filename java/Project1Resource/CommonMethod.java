package Project1Resource;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CommonMethod {

		
		public static void selectdates(List<WebElement> az,String idx)  {
			
			List<WebElement> as=az;
			
		  for(WebElement v1:as)    {
			  
			  
	    if(v1.getText().equalsIgnoreCase(idx))		{	
	    	 
				  v1.click();
				  break;
			  }
		  }
		}  
		
    public static void assertionhandle(String actual,String expected,String message)    {
	
	  SoftAssert sa=new SoftAssert();
	  
	  String ac=actual;
	  String ep=expected;
	  
     sa.assertEquals(ac, ep, message);
     
     sa.assertAll();
	}

}
