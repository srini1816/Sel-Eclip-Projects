package sanityTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailChrome {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium jars\\chrome\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://mail.google.com");

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	driver.findElement(By.cssSelector("#Email")).sendKeys("sriselenium2018@gmail.com");

	driver.findElement(By.cssSelector("#next")).click();

	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	driver.findElement(By.cssSelector("#Passwd")).sendKeys("Prahi@786");

	driver.findElement(By.cssSelector("#signIn")).click();

	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	//driver.close();

	//driver.quit();

	}

}
