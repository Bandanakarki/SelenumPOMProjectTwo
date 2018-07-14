package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Techfioshomepage;
import page.Techfiosloginpage;
import util.BrowserFactory;

public class TechfiosTwoTest {

	
	@Test
	public void TechfiosTwoTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	Techfiosloginpage loginPage = PageFactory.initElements(driver, Techfiosloginpage.class);
	
	loginPage.login_Techfios();		
	
	Techfioshomepage homepage = PageFactory.initElements(driver, Techfioshomepage.class);

      //     homepage.secondpage();
           
           homepage.validatetitle();
       
           driver.close();

       	driver.quit();
       				
	}
	}
