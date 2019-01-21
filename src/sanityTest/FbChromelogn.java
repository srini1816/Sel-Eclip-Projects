package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbChromelogn {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium jars\\chrome\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("srinivas.che2009@gmail.com");


	driver.findElement(By.id("pass")).sendKeys("prahi@123");
	driver.findElement(By.id("loginbutton")).click();
	driver.close();

	}

}
