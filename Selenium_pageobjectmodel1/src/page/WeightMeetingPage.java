package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeightMeetingPage {

	WebDriver driver;

	public WeightMeetingPage(WebDriver ldriver)
	{

		this.driver = ldriver;
	}

	@FindBy(how = How.TAG_NAME, using = "title")
	WebElement findMeeting;

	@FindBy(how = How.ID, using = "meetingSearch")
	WebElement meetingSearch;

	@FindBy(how = How.CLASS_NAME, using = "input-group-btn")
	WebElement searchButton;

	@FindBy(how = How.CLASS_NAME, using = "location__distance")
	WebElement locationdistance;

	@FindBy(how=How.CLASS_NAME, using="location__name")
	WebElement locationname;

	@FindBy(how = How.ID, using = "ml-1180510")
	WebElement firstLocation;

	public void validateTitleMatch(String expectedTitle) {

		if (driver.getTitle().contains(expectedTitle))
		{
			System.out.println("Title matches");
		}
		else
		{
			System.out.println("Title mismatch");
		}
	}
	
	public void searchBar() {

		meetingSearch.sendKeys("10011");
		searchButton.click();
}

	public void firstLocation() {

		firstLocation.click();
	}
	
	public String printlocationname() {
		String title = locationname.getText();
		System.out.println(title);
		
		return title;
	}
	public void printDistance() {
		System.out.println(locationdistance.getText());
	}
	
	public void verifyResultDetail(String firstResultTitle) {
		if (this.locationname.getText().equals(firstResultTitle)) {
			System.out.println("result title matches on the search result and detail");
		}
	}

}

