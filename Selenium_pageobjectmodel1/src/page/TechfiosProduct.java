package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosProduct {


			WebDriver driver;
			
			public TechfiosProduct(WebDriver ldriver)
			{
			this.driver = ldriver;
		}

		@FindBy(how=How.XPATH, using="//text()[contains(.,'Products & Services')]/ancestor::a[1]")
			WebElement ProductsandServices;
		
		@FindBy(how=How.XPATH, using="//a[text()='Products']")
		WebElement NewProduct;
		
		@FindBy(how=How.XPATH, using="//h2[contains(text(),'Products & Services')]")
		WebElement Productsandservices;


public void thirdsection(){
 	
	ProductsandServices.click();
  NewProduct.click();
      
}

}


