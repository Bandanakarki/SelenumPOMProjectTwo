package test;


	import java.io.IOException;

	import org.junit.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;


import page.TechfiosIncome;

import page.Techfiosloginpage;
	import util.BrowserFactory;

	public class TechfiosincomeTest {

		
		@Test
		public void TechfiosincomeTest() throws IOException{
				
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
						
				
		Techfiosloginpage loginPage = PageFactory.initElements(driver, Techfiosloginpage.class);

		//Techfioshomepage homepage = PageFactory.initElements(driver, Techfioshomepage.class);
		
		TechfiosIncome middle = PageFactory.initElements(driver, TechfiosIncome.class);
		
					
		loginPage.login_Techfios();
		//homepage.secondpage();
       // middle.middlesection();-we do not need to call this here
		middle.validate();
               
        
			
		}
		
		
     }
