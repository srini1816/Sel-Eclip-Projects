package sanityTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailFFLOG {

	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();

driver.get("https://mail.google.com");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

driver.findElement(By.id("Email")).sendKeys("sriselenium2018@gmail.com");

driver.findElement(By.id("next")).click();

driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

driver.findElement(By.id("Passwd")).sendKeys("Prahi@786");

driver.findElement(By.id("signIn")).click();

driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


//driver.close();

//driver.quit();


	}

}
