package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO {

	final WebDriver driver;
	
	public PO(WebDriver driver) {
		this.driver=driver;
	}

	//Overview product objects
   	@FindBy(xpath="//a[@class='product-name' and @href='http://automationpractice.com/index.php?id_product=4&controller=product' and @title='Printed Dress' and @itemprop='url']")        	
   	WebElement imgButton;

    @FindBy(css="a#new_comment_tab_btn")
    WebElement reviewButton;
    
    @FindBy(css="input#comment_title")
    WebElement titleButton;
    
    @FindBy(css="textarea#content")
    WebElement areaButton;

    @FindBy(css="button#submitNewMessage")
    WebElement sendButton;
	
    @FindBy(xpath="//button[@class='button btn-default button-medium']")
    WebElement okButton;

				
	//Overview product method test
	public void selectProduct() throws InterruptedException {
		imgButton.click();
		Thread.sleep(3000);
	}
	
	public void reviewButton() throws InterruptedException {
		reviewButton.click();
		Thread.sleep(3000);
	}
	
	public void commentProduct(String title, String comment) throws InterruptedException {
		titleButton.sendKeys(title);
		areaButton.sendKeys(comment);
		Thread.sleep(3000);
	}

	public void sendComment() throws InterruptedException {
		sendButton.click();
		Thread.sleep(3000);
	}
	
	public void confirmComment() throws InterruptedException {
		okButton.click();
		Thread.sleep(3000);
	}
	
}//End of the OP class
