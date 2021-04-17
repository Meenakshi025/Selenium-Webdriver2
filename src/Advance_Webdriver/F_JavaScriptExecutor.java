package Advance_Webdriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class F_JavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.get("http://www.espncricinfo.com/");
		((JavascriptExecutor)driver).executeScript("mopen('m1");
		
		driver.findElement(By.xpath(".//*[@id='nav_grp']/li[2]/div[2]/ul/li[1]/a")).click();
		driver.close();
	}

}
