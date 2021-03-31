package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

	final WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath = "//*[@title='View my customer account']")
	WebElement myaccountButton;
	
	@FindBy(xpath ="//*[@title='My wishlists']")
	WebElement mywishlistButton;

	@FindBy(xpath="//a[@title='Addresses']")
	WebElement MyAddresess;
	
	public void openMyAccountPage() throws InterruptedException {
		myaccountButton.click();
		Thread.sleep(1000);
	}

    public void openMyWishlistPage() throws InterruptedException {
		mywishlistButton.click();
		Thread.sleep(1000);
	}

	public void clickOnMyAddress() throws InterruptedException{
        MyAddresess.click();
        Thread.sleep(1000);
    }
}
