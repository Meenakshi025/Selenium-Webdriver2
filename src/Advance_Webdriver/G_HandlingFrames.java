package Advance_Webdriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class G_HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.get("http://www.firstcry.com/");
		driver.switchTo().frame("iframe_Login");
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("Meenakshi.patil04@gmail.com");
		driver.findElement(By.xpath(".//*[@id='Mobile']")).sendKeys("9970518378");
		
		driver.findElement(By.xpath(".//*[@id='btnSignUp']")).click();
		driver.findElement(By.xpath(".//*[@id='amt']/div[2]/div[1]/div[1]/div[3]/div")).click();
		driver.close();

	}

}
