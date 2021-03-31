package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	final WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@class='product_img_link' and @href='http://automationpractice.com/index.php?id_product=2&controller=product&search_query=Blouse&results=1']")
	WebElement SelectProduct;

	public void openProduct() throws InterruptedException {
		SelectProduct.click();
		Thread.sleep(1000);
	}

}
