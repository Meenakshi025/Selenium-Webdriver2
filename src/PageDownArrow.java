import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PageDownArrow {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		URL url = new URL(driver.getCurrentUrl());
		String domain = url.getHost();
		System.out.println(domain);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='fsl']/a[2]")).click();
        driver.findElement(By.xpath(".//*[@id='advertise']/div/div[1]/div[1]/h2")).sendKeys(Keys.PAGE_DOWN);
    	Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='advertise']/div/div[1]/div[1]/h2")).sendKeys(Keys.PAGE_UP);
    	Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys(Keys.BACK_SPACE);
        
	}

}
