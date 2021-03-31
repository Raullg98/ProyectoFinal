package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryCheckoutPage {

	final WebDriver driver;
	
	public SummaryCheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(css = "p[class*='cart_navigation'] a[title='Proceed to checkout']")
	WebElement proceedToCheckoutButton;

	public void clickProceedToCheckoutButton() {
		proceedToCheckoutButton.click();;
	}
	
}
