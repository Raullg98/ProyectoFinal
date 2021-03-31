package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentCheckoutPage {

	final WebDriver driver;
	
	public PaymentCheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath = "//*[@title='Pay by bank wire']")
	WebElement payByBankWireButton;

	@FindBy(xpath = "//*[@title='Pay by check.']")
	WebElement payByCheckButton;

	@FindBy(xpath = "//*[text()='I confirm my order']")
	WebElement confirmMyOrderButton;

	public void clickPayByBankWireButton() {
		this.payByBankWireButton.click();;
	}

	public void clickPayByCheckButton() {
		this.payByCheckButton.click();;
	}

	public void clickConfirmMyOrderButton() {
		confirmMyOrderButton.click();
	}
}
