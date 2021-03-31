package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.implementation.bytecode.Throw;

public class YourAddressPage {
    
    final WebDriver driver;

    public YourAddressPage(WebDriver driver) {
		this.driver=driver;
	}

    @FindBy(xpath = "//input[@id='address1']")
    WebElement AddressUnoInput; 

    @FindBy(xpath = "//input[@id='city']")
    WebElement CityInput;
    
    @FindBy(xpath="//select[@id='id_state']")
    WebElement stateDropdown;

    @FindBy(xpath ="//input[@id='postcode']")
    WebElement zipCodeInput;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement HomePhoneInput;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement MobilePhoneInput;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElement AdittionalInformationInput; 

    @FindBy(xpath="//input[@id='alias']")
    WebElement NameTosave;

    @FindBy(xpath = "//button[@id='submitAddress']")
    WebElement SubmiteNewAddressInput;

    
    public void InputAddNewAddress(String NewAddress) throws InterruptedException {
		AddressUnoInput.sendKeys(NewAddress);
		Thread.sleep(1000);
	}

    public void InputAddCity(String City) throws InterruptedException{
        CityInput.sendKeys(City);
        Thread.sleep(1000);
    }

    public void InputAddState(String id_state) throws InterruptedException{
        stateDropdown.sendKeys("stateDropwdown");
        Thread.sleep(1000);
    }

    public void InputZipCode(String ZipCode) throws InterruptedException{
        zipCodeInput.sendKeys(ZipCode);
        Thread.sleep(1000);
    }

    public void InputHomePhone(String HomePhone) throws InterruptedException{
        HomePhoneInput.sendKeys(HomePhone);
        Thread.sleep(1000);
    }

    public void InputMobilePhone(String MobilPhone) throws InterruptedException{
        MobilePhoneInput.sendKeys(MobilPhone);
        Thread.sleep(1000);
    }

    public void InputAddittionalInfomration(String AddInformation) throws InterruptedException{
        AdittionalInformationInput.sendKeys(AddInformation);
        Thread.sleep(1000);
    }

    public void InputToSaveAlias(String Alias) throws InterruptedException{
        NameTosave.sendKeys(Alias);
        Thread.sleep(1000);
    }

    public void ClickonSubmitNewAddress() throws InterruptedException{
        SubmiteNewAddressInput.click();
        Thread.sleep(1000);
    }
    

}
