package pages;

//import javax.swing.text.PlainView;

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
	//Oziel Find By

	
	@FindBy(xpath= "//a[@class='product-name' and @href='http://automationpractice.com/index.php?id_product=4&controller=product' and @title='Printed Dress' and @itemprop='url']")
	WebElement showPrintedDress;

	@FindBy(xpath= "//a[@class='product-name' and @href='http://automationpractice.com/index.php?id_product=2&controller=product' and @title='Blouse' and @itemprop='url']")
	WebElement showBlouse;

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
	//Oziel public voids
	//showFeatures
	public void show() throws InterruptedException {
		showPrintedDress.click();
		Thread.sleep(5000);
	}
	public void show2() throws InterruptedException {
		showBlouse.click();
		Thread.sleep(5000);

	}
}
