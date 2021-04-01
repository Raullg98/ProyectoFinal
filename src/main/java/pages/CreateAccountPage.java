package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

	final WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="id_gender1")
	WebElement mrRadio;
	
	@FindBy(id="id_gender2")
	WebElement mrsRadio;
	
	@FindBy(id="customer_firstname")
	WebElement firstNameTextBox;
	
	@FindBy(id="customer_lastname")
	WebElement lastNameTextBox;
	
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="passwd")
	WebElement passwordTextBox;
	
	@FindBy(id="days")
	WebElement dayDropdown;
	
	@FindBy(id="months")
	WebElement monthDropdown;
	
	@FindBy(id="years")
	WebElement yearDropdown;
	
	@FindBy(id="newsletter")
	WebElement signUpForNewsletterCheckBox;
	
	@FindBy(id="optin")
	WebElement receiveSpecialCheckBox;
	
	@FindBy(id="firstname")
	WebElement addressFirstNameTextBox;
	
	@FindBy(id="lastname")
	WebElement addressLastNameTextBox;
	
	@FindBy(id="company")
	WebElement companyTextBox;
	
	@FindBy(id="address1") 
	WebElement addressTextBox;
	
	@FindBy(id="address2")
	WebElement address2TextBox;
	
	@FindBy(id="city")
	WebElement cityTextBox;
	
	@FindBy(id="id_state")
	WebElement stateDropdown;
	
	@FindBy(id="postcode")
	WebElement zipCodeTextBox;
	
	@FindBy(name="id_country")
	WebElement countryDropdown;
	
	@FindBy(id="other")
	WebElement additionalInfoTextBox;
	
	@FindBy(id="phone")
	WebElement homePhoneTextBox;
	
	@FindBy(id="phone_mobile")
	WebElement mobilePhoneTextBox;
	
	@FindBy(id="alias")
	WebElement addressAliasTextBox;
	
	@FindBy(id="submitAccount")
	WebElement registerButton;

	public void enterFirstName(String firstName) throws InterruptedException {
		firstNameTextBox.sendKeys(firstName);
		Thread.sleep(4000);
	}

	public void enterLastName(String lastName) throws InterruptedException {
		lastNameTextBox.sendKeys(lastName);
		Thread.sleep(4000);
	}

	public void enterPassword(String password) throws InterruptedException {
		passwordTextBox.sendKeys(password);
		Thread.sleep(4000);
	}

	public void enterAddress(String address1) throws InterruptedException {
		addressTextBox.sendKeys(address1);
		Thread.sleep(4000);
	}

	public void enterCity(String city) throws InterruptedException {
		cityTextBox.sendKeys(city);
		Thread.sleep(4000);
	}

	public void enterId_state(String id_state) throws InterruptedException {
		stateDropdown.sendKeys("stateDropdown");
		Thread.sleep(4000);
	}

	public void enterPostcode(String postcode) throws InterruptedException {
		zipCodeTextBox.sendKeys(postcode);
		Thread.sleep(4000);
	}

	public void enterId_country(String id_country) throws InterruptedException {
		countryDropdown.sendKeys("countryDropdown");
		Thread.sleep(4000);
	}
	public void enterPhone_mobile(String phone_mobile) throws InterruptedException {
		mobilePhoneTextBox.sendKeys(phone_mobile);
		Thread.sleep(4000);
	}

	public void clickRegisterButton() throws InterruptedException {
		registerButton.click();
		Thread.sleep(4000);
	}
}
