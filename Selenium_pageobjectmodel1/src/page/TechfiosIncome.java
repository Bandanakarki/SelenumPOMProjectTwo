package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosIncome {

	WebDriver driver;
	
	public TechfiosIncome(WebDriver ldriver){
	this.driver = ldriver;
}

@FindBy(how=How.XPATH, using="//h2[contains(text(),'Dashboard')]")
	WebElement Dashboard;
@FindBy(how=How.XPATH, using="//span[contains(text(),'Income Today')]")
WebElement Incometoday;

@FindBy(how=How.XPATH, using="//span[contains(text(),'Expense Today')]")
WebElement Expensetoday;


@FindBy(how=How.XPATH, using="//span[contains(text(),'Income This Month')]")
WebElement Incomethismonth;

@FindBy(how=How.XPATH, using="//span[contains(text(),'Expense This Month')]")
WebElement graph;
@FindBy(how=How.XPATH, using="//*[@class=' c3-event-rect c3-event-rect-11']")
WebElement chart;





 

public void middlesection(){

 Incometoday.click();
 Expensetoday.click();
 Incomethismonth.click();
 graph.click();
 chart.click();
     
}

public void validate(){
	
	  if (Dashboard.isDisplayed())
	  { 
	  
		  System.out.println("login successful");
}

}
}



