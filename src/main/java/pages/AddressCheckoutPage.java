package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressCheckoutPage {

	final WebDriver driver;

	@FindBy(css = "button[name='processAddress']")
	WebElement proceedToCheckoutButton;
	
	public AddressCheckoutPage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickProceedToCheckoutButton() {
		proceedToCheckoutButton.click();
	}

}
