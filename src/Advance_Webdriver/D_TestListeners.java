package Advance_Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class D_TestListeners {

	public static void main(String[] args) throws Exception {
		WebDriver webdrive = new FirefoxDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdrive);
		 C_WebListeners listners = new  C_WebListeners();
		 driver.register(listners);
		Thread.sleep(2000);
		
		driver.navigate().to("http://google.com");
		driver.findElement(By.xpath(".//*[@id='fsl']/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='fsl']/a[2]")).click();
		driver.navigate().back();
		driver.navigate().forward();
	}

}
