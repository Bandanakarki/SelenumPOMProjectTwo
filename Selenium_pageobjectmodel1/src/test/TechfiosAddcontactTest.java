package test;


	import java.io.IOException;

	import org.junit.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

import page.AddContacts;
import page.Techfioshomepage;
import page.Techfiosloginpage;
	import util.BrowserFactory;

	public class TechfiosAddcontactTest {

		
		@Test
		public void TechfiosAddcontactTest() throws IOException{
				
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
						
				
		Techfiosloginpage loginPage = PageFactory.initElements(driver, Techfiosloginpage.class);

		Techfioshomepage homepage = PageFactory.initElements(driver, Techfioshomepage.class);
		
		AddContacts AddContact = PageFactory.initElements(driver, AddContacts.class);
		
					
		loginPage.login_Techfios();
		homepage.secondpage();
        AddContact.addcontacts();
               
        driver.close();

		driver.quit();
					
			
		}
		
		
     }

	
