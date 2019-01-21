package sanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FfGmailogn {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
	//	driver.get("https://www.google.com/");//
		
driver.get("https://www.facebook.com/login.php");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("srinivas.che2009@gmail.com");


driver.findElement(By.id("pass")).sendKeys("prahi@123");
driver.findElement(By.id("loginbutton")).click();

	}

}
