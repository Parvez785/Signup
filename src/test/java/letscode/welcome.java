package letscode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class welcome {

	 public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable

	        // Set ChromeOptions
	      

	        // Instantiate the WebDriver with ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open a website
	        driver.get("http://www.google.com");

	        // Close the browser
	        driver.quit();
	 }
}
