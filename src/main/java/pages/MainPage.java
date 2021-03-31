package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

	final WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchButton;
	
	@FindBy(xpath="//img[@alt='My Store']")
	WebElement logoImg;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;

	@FindBy(xpath="//a[@title='View my shopping cart']")
	WebElement cart;

	@FindBy(id="newsletter-input")
	WebElement newsletterInput;

	@FindBy(xpath ="//*[@name='submitNewsletter']")
	WebElement submitNewsletterButton;

	@FindBy(css = "p.alert")
	WebElement alert;

	//*[text()=' Newsletter : You have successfully subscribed to this newsletter.']
	
	public void searchClothes(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(1000);
		searchButton.click();
	}
	
	public void goHome() throws InterruptedException {
		logoImg.click();
		Thread.sleep(1000);
	}
	
	public void openSignInPage() throws InterruptedException {
		signIn.click();
		Thread.sleep(1000);
	}

	public void openCartPage() throws InterruptedException {
		cart.click();
		Thread.sleep(1000);
	}

	public void signUpForNewsletter(String email) {
		newsletterInput.sendKeys(email);
		submitNewsletterButton.click();
	}

	public String getAlertMessage() {
		return alert.getText();
	}
}
