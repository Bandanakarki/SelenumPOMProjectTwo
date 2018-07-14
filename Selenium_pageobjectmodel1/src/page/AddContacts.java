package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContacts {

WebDriver driver;
	
	public  AddContacts(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID, using="account")
	WebElement full_name;
	
	@FindBy(how=How.ID,using="company")
	WebElement company_name;
	
	@FindBy(how=How.ID, using="email")
	WebElement email;
	@FindBy(how=How.ID,using="phone")
	WebElement phone;
	@FindBy(how=How.ID,using="address")
	WebElement address;
	@FindBy(how=How.ID,using="city")
	WebElement city;
	@FindBy(how=How.ID,using="state")
	WebElement state;
	@FindBy(how=How.ID,using="zip")
	WebElement zip;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submit;
	
     public void addcontacts(){
		
    	 full_name.sendKeys("Vandana");
 		company_name.sendKeys("RPT LLC");
 		email.sendKeys("bk@gmail.com");
 		phone.sendKeys("2223334444");
 		address.sendKeys("2214 Hyfe Park");
 		city.sendKeys("Irving");
 		state.sendKeys("TX");
 		zip.sendKeys("22201");
 		
 		submit.click();
 	}

}

