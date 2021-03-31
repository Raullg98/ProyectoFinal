package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingCheckoutPage {

	final WebDriver driver;
	
	public ShippingCheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id = "cgv")
	WebElement agreeCheckbox;

	@FindBy(xpath = "//*[text()='(Read the Terms of Service)']")
	WebElement readTermsOfServiceElement;

	@FindBy(xpath = "//*[@name='processCarrier']")
	WebElement proceedToCheckout;
	
	public void checkTermsOfServiceCheckbox() {
		agreeCheckbox.click();
	}

	public void clickProceedToCheckoutButton() {
		proceedToCheckout.click();
	}


}
