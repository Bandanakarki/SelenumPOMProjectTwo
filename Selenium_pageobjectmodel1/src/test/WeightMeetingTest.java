package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.WeightHomePage;
import page.WeightMeetingPage;


import util.BrowserFactory;

public class WeightMeetingTest {
	
	@Test
	public void loginTest() throws InterruptedException {
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");
	driver.manage().window().maximize();
	
	
	WeightHomePage Homepage = PageFactory.initElements(driver, WeightHomePage.class);
	
	String expectedTitle = "Weight Loss Program, Recipes & Help | Weight Watchers";
	Homepage.validatehometitle(expectedTitle);
	
	
	Homepage.clickmeeting();			

	WeightMeetingPage Meetingpage = PageFactory.initElements(driver, WeightMeetingPage.class);
	String expectedTitle_FindMeeting = "Get Schedules & Times Near You";
	Meetingpage.validateTitleMatch(expectedTitle_FindMeeting);
				
	Meetingpage.searchBar();
	
	String firstResultTitle = Meetingpage.printlocationname();
	Meetingpage.printDistance();
	
	Meetingpage.firstLocation();
	Meetingpage.verifyResultDetail(firstResultTitle);	


	
	
	
	
	
	driver.close();
	driver.quit();
	

	
	
}
	}

	
	