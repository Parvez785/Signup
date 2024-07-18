package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import pagemodel.SignInPage;
public class signpage {

	WebDriver driver ;
	SignInPage Test25;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		Test25 = new SignInPage(driver);
		driver.get("https://magento2-demo.scandiweb.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvMi1kZW1vLnNjYW5kaXdlYi5jb20v/");
	}
	
	@Test
	public void Signin() {
		Test25.email("rowogi5200@bikedid.com");
		Test25.password("test@123");
        Test25.Check();
        Test25.btnclick();
		String Title = driver.getTitle();
		String expectedTitle= "Home Page";
		Assert.assertEquals(Title, expectedTitle);
	}
	
	//Failed Login using incorrect Email
	@Test
	public void failSignin() {
		Test25.email("rowogi5200@bikedid1.com");
		Test25.password("test@123");
        Test25.Check();
        Test25.btnclick();
       
		WebElement Message= driver.findElement(By.cssSelector(".message-error.error.message"));
		Assert.assertTrue(Message.isDisplayed(), "Error message is not visible after sign in");
		//Assert.assertEquals(Message.getText(),"Incorrect CAPTCHA");
	}
	
	
	@Test
	public void incompleteSignin() {
		Test25.email("");
		Test25.password("test@123");
        Test25.Check();
        Test25.btnclick();
	   WebElement Error= driver.findElement(By.id("email-error"));
	  Assert.assertEquals(Error.getText(),"This is a required field.");
	   
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

	
}
