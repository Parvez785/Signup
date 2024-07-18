package pagemodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {


    WebDriver driver;
    WebDriverWait wait;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
	//Locating form Input Elements for Signup Page
	By FirstName= By.id("firstname");
	By LastName= By.id("lastname");
	By checkbox= By.id("is_subscribed");
	By Assistcheckbox= By.id("assistance_allowed_checkbox");
	
	//Locating Sign-in input field

	By Email= By.id("email_address");
	By Password= By.id("password");
	By ConfirmPassword= By.id("password-confirmation");
    By Showpassword = By.id("show-password");
    By Button = By.cssSelector("#form-validate > div > div.primary > button");

	
    // Methods for filling Up form
    
 public void Fname(String fname) {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(FirstName)).sendKeys(fname);
 }
 
 public void Lname(String Lname) {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(LastName)).sendKeys(Lname);
 }
 
 public void checkbox2() {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox)).click();
 }
 
 public void Assistcheckbox3() {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(Assistcheckbox)).click();
 }
 
 
 public void email(String email) {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(Email)).sendKeys(email);

 }
 
 public void password(String password) {

	 wait.until(ExpectedConditions.visibilityOfElementLocated(Password)).sendKeys(password);
 }
 
 public void confirmPassword(String confirmpassword) {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPassword)).sendKeys(confirmpassword);
 }
 
 public void ShowpasswordChecked() {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(Showpassword)).click();
 }
 public void Clickbtn() {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(Button)).click();
 
 }
 
}
