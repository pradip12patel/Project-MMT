package Project1PageobjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchflightObject {
	
	WebDriver driver;
	
	public By cancal=By.xpath("//span[@class='ic_circularclose_grey']");
	public By from=By.xpath("//span[normalize-space()='From']");
	public By city=By.xpath("//input[contains(@placeholder,'From')]");
	public By raj=By.xpath("//p[contains(text(),'Mumbai, India')]");
	public By to=By.xpath("//span[normalize-space()='To']");
	public By city1=By.xpath("//input[contains(@placeholder,'To')]");
	public By del=By.xpath("//p[contains(text(),'New Delhi, India')]");
	public By plus=By.xpath("//span[contains(@aria-label,'Next Month')]");
	public By title=By.xpath("(//div[@class='DayPicker-Caption'])[2]");
	public By dates=By.xpath("(//div[@class='DayPicker-Body'])[2]//div//div//div//p");
	public By trav=By.xpath("//span[contains(@class,'lbl_input latoBold appendBottom5')]");
	public By adult=By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[1]//li[5]");
	public By child=By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[2]//li[2]");
	public By infants=By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[3]//li[2]");
	public By business=By.xpath("//ul[@class='guestCounter classSelect font12 darkText']//li[2]");
	public By apply=By.xpath("(//button[@type='button'])[1]");
	public By search=By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");
	public By actual=By.xpath("(//p[@class='filtersHeading appendBottom15'])[1]");
	public By close=By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']");
	
	public SearchflightObject(WebDriver driver2) {
	
		this.driver=driver2;
	}

   public WebElement clickcancal()   {
		
		return driver.findElement(cancal);
	}  
	
	public WebElement clickfrom()   {
		
		return driver.findElement(from);
	}
	
	public WebElement putcity()  {
		
		return driver.findElement(city);
	}
	public WebElement rajcity()  {
		
		return driver.findElement(raj);
	}
	public WebElement clickto()  {
		
		return driver.findElement(to);
	}
   public WebElement putcity1()  {
		
		return driver.findElement(city1);
	}
   public WebElement clickdel()  {
	   
	   return driver.findElement(del);
   }
   public WebElement clickplus()  {
	   
	   return driver.findElement(plus);
   }
   public WebElement clicktitle()  {
	   
	   return driver.findElement(title);
   }
   public List<WebElement> thedates()  {
	   
	   return driver.findElements(dates);
   }
   public WebElement clicktrav()   {
	   
	   return driver.findElement(trav);
   }
 public WebElement clickadult()   {
	   
	   return driver.findElement(adult);
   }
 public WebElement clickchild()   {
	   
	   return driver.findElement(child);
 }
 public WebElement clickinfacts()   {
	   
	   return driver.findElement(infants);
 }
 public WebElement clickbusiness()   {
	   
	   return driver.findElement(business);
}
 public WebElement clickapply()   {
	   
	   return driver.findElement(apply);
}
 public WebElement clicksearch()   {
	   
	   return driver.findElement(search);
}
    public WebElement actualmessage()  {
    	
    	return driver.findElement(actual);
    }
    public WebElement clickclose()   {
    	
    	return driver.findElement(close);
    }
}
