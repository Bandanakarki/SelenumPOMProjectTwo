package test;


import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.TechfiosAddProduct;
import page.TechfiosProduct;
import page.Techfioshomepage;
import page.Techfiosloginpage;
import util.BrowserFactory;

public class TechfiosAddProductTest {

	
		
@Test
		public void TechfiosAddcontactTest() throws IOException, InterruptedException{
				
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
						
				
		Techfiosloginpage loginPage = PageFactory.initElements(driver, Techfiosloginpage.class);

		Techfioshomepage homepage = PageFactory.initElements(driver, Techfioshomepage.class);
		
		TechfiosAddProduct product = PageFactory.initElements(driver, TechfiosAddProduct.class);
		
		TechfiosProduct productpage = PageFactory.initElements(driver, TechfiosProduct.class);
				
		loginPage.login_Techfios();
		homepage.secondpage();
		productpage.thirdsection();	
        product.addproducts();
           Thread.sleep(3000);    
        driver.close();

		driver.quit();
					
			
		}
		
		
     }

	

