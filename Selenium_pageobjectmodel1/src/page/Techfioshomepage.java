package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Techfioshomepage {

		WebDriver driver;
		
		public Techfioshomepage(WebDriver ldriver)
		{
		this.driver = ldriver;
	}

	@FindBy(how=How.XPATH, using="//h2[contains(text(),'Dashboard')]")
		WebElement Dashboard;
	@FindBy(how=How.XPATH, using="//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement crmlink;
	
	@FindBy(how=How.XPATH, using="//a[text()='Add Contact']")
	WebElement addcontactlink;
	
	
	

     

   public void secondpage(){
    	
	 crmlink.click();
     addcontactlink.click();
         
   }

   public void validatetitle(){
		
		  if (Dashboard.isDisplayed())
		  { 
		  
			  System.out.println("login successful");
}
	
}
}

	

