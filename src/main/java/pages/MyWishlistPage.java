package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishlistPage {

    final WebDriver driver;
	
	public MyWishlistPage(WebDriver driver) {
		this.driver=driver;
	}

    @FindBy(id = "name")
    WebElement wishlistTextBox;

    @FindBy(id = "submitWishlist")
    WebElement saveWishlistButton;

	@FindBy(xpath ="//a[@class='icon']")
	WebElement deleteWishlistButton;

    public void createWishlist(String name) throws InterruptedException {
		wishlistTextBox.sendKeys(name);
		Thread.sleep(1000);
		saveWishlistButton.click();
		Thread.sleep(3000);
	}

	public void clickRemoveWishlist() throws InterruptedException {
		deleteWishlistButton.click();
		Thread.sleep(2000);
	}
    
}
