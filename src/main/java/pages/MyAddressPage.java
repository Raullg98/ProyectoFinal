package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.implementation.bytecode.Throw;

public class MyAddressPage {

    final WebDriver driver;

    public MyAddressPage(WebDriver driver) {
		this.driver=driver;
	}

    @FindBy(xpath = "//a[@title='Add an address']")
    WebElement AddNewAddress; 

    public void clickOnMyNewAddress() throws InterruptedException{
        AddNewAddress.click();
        Thread.sleep(1000);
    }
    
}
