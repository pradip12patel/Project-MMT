package TestcaseProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Project1PageobjectModel.SearchflightObject;
import Project1Resource.BaseClassMMT;
import Project1Resource.CommonMethod;
import Project1Resource.ConstantsMethod;

public class verify extends BaseClassMMT{
	
	@Test
	public void verifyMMT()    {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SearchflightObject obj=new SearchflightObject(driver);
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",obj.clickcancal());
		//obj.clickcancal().click();
		obj.clickfrom().click();
		obj.putcity().sendKeys(ConstantsMethod.putscity);
		obj.rajcity().click();
		obj.clickto().click();
		obj.putcity1().sendKeys(ConstantsMethod.putscity1);
		obj.clickdel().click();
		
		String title="";
		while(!(title.equals("July 2023")))  {
			
			JavascriptExecutor executor4=(JavascriptExecutor)driver;
			executor4.executeScript("arguments[0].click();",obj.clickplus());
			//obj.clickplus().click();
			obj.clicktitle();
			title=obj.clicktitle().getText();	
		}
		CommonMethod.selectdates(obj.thedates(), "15");
		
       
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",obj.clicktrav());
		//obj.clicktrav().click();
		
		obj.clickadult().click();
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();",obj.clickchild());
		//obj.clickchild().click();
		obj.clickinfacts().click();
		obj.clickbusiness().click();
		obj.clickapply().click();
		obj.clicksearch().click();
		
		obj.clickclose().click();
		
		CommonMethod.assertionhandle(obj.actualmessage().getText(), ConstantsMethod.expectedmessage, "searchflight is faild");
	}
}
	


