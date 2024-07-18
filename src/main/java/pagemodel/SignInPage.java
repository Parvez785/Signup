package pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

	WebDriver driver;
	WebDriverWait Wait;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locating input Elements
	By Email = By.id("email");
	By Password = By.id("pass");
    By Check= By.id("show-password");
    By btn= By.xpath("//button[@id=\"send2\"]");
    
    //Creating Methods
    
    public void email(String email) {
    	driver.findElement(Email).sendKeys(email);
    }
    public void password(String password) {
    	driver.findElement(Password).sendKeys(password);
    }
    
    public void Check() {
    	driver.findElement(Check).click();
    }
    
    public void btnclick() {
    	driver.findElement(btn).click();
    }


    
	
	
}
