package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosAddProduct {

	WebDriver driver;
	
public TechfiosAddProduct(WebDriver ldriver) {
 this.driver= ldriver;

 
}

@FindBy(how=How.ID, using="name")
WebElement Name;

@FindBy(how=How.ID,using="sales_price")
WebElement sales_price;

@FindBy(how=How.ID, using="item_number")
WebElement item_number;
@FindBy(how=How.ID,using="description")
WebElement description;
@FindBy(how=How.ID,using="submit")
WebElement submit;

public void addproducts(){
	
	Name.sendKeys("Selenium");
	sales_price.sendKeys("2500");
	item_number.sendKeys("222555888999");
	description.sendKeys("2223334444");
	submit.click();	
		
	}

}



