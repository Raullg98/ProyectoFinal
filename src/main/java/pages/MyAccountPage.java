package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.implementation.bytecode.Throw;

public class MyAccountPage {
    
    final WebDriver driver;

    public MyAccountPage(WebDriver driver) {
		this.driver=driver;
	}

    @FindBy(xpath="//a[@title='Addresses']")
	WebElement MyAddresess;


    public void clickOnMyAddress() throws InterruptedException{
        MyAddresess.click();
        Thread.sleep(1000);
    }
}
