package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagemodel.SignupPage;


public class Test110 {

	WebDriver driver;
	SignupPage Test;
   
	
	@BeforeMethod
	    public void setup() {
		driver= new ChromeDriver();
	   	driver.get("https://magento2-demo.scandiweb.com/customer/account/create/");
		Test= new SignupPage(driver);
	   }

	
@Test
 public void formsignup() throws InterruptedException {
	Test.Fname("Ajay");	
	Test.Lname("kat");	
	Test.checkbox2();	
	Thread.sleep(2000);
    Test.Assistcheckbox3();
    Test.email("test@gmail.com");
    Test.password("test123");
    Test.confirmPassword("test123");
    Test.ShowpasswordChecked();
	Thread.sleep(2000);

    Test.Clickbtn();
}
		
    @AfterMethod
   
    public void teardown() {
	   	driver.close();
	}
}