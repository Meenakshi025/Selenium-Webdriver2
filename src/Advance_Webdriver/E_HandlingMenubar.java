package Advance_Webdriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class E_HandlingMenubar {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.get("https://www.flipkart.com/");
		
		WebElement menu = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[4]/a/span"));
		
		WebElement submenu = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[4]/ul/li/ul/li[1]/ul/li[3]/a"));
				
		Actions action = new Actions(driver);
		
		action.moveToElement(menu).perform();                    
		
		submenu.click();
		
	}

}
