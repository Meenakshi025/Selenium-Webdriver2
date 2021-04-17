import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.*;
import java.util.concurrent.TimeUnit;

public class TestSample {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new  FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());	
		
		/*WebElement element =  driver.findElement(By.id("Email"));
		element.sendKeys("meenakshi.patil04@gmail.com");
		element.click();
		
		element = driver.findElement(By.className("rc-button"));
		element.click();
		 
		element = driver.findElement(By.name("Passwd"));
		element.sendKeys("meenu@123");
		element.click();
		
		driver.findElement(By.id("signIn")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     element = driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']"));
	    System.out.println(element.getText());*/
		
		driver.findElement(By.id("Email")).sendKeys("meenakshi.patil04@gmail.com");
		driver.findElement(By.className("rc-button")).click();
		 driver.findElement(By.name("Passwd")).sendKeys("meenu@123");
		 driver.findElement(By.id("signIn")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']")).getText());
		
		
	}

}
