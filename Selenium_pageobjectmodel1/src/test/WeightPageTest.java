package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.WeightHomePage;



import util.BrowserFactory;

public class WeightPageTest {
	
	@Test
	public void loginTest() throws InterruptedException {
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");
	driver.manage().window().maximize();
	
	
	WeightHomePage Homepage = PageFactory.initElements(driver, WeightHomePage.class);
	
	String expectedTitle = "Weight Loss Program, Recipes & Help | Weight Watchers";
	Homepage.validatehometitle(expectedTitle);
	Homepage.clickmeeting();
	
	
	
	driver.close();
	driver.quit();
	

	
	
}
	}

	
	