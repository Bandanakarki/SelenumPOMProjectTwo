
package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeightHomePage {


	WebDriver driver;
	
public  WeightHomePage  (WebDriver ldriver)
{
 this.driver= ldriver;

 }

@FindBy(how=How.ID,using="ela-menu-visitor-desktop-supplementa_find-a-meeting")
WebElement findameeting;


public void validatehometitle(String expectedtitle)
		
{
	  
	if (driver.getTitle().equals(expectedtitle))		  
	  {
		  System.out.println("Weight Loss Program, Recipes & Help | Weight Watchers: matchingtitle");
		  
	  }
	else
		
{

		System.out.println("Title mismatch");
	}
}


		  public void clickmeeting()
		  {
			  findameeting.click();
		  }


}

