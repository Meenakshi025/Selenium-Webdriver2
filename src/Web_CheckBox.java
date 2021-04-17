import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Web_CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("meenakshi.patil04@gmail.com");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("Meenu@676");
		
		List<WebElement> CheckBox = driver.findElements(By.name("PersistentCookie"));
		System.out.println(CheckBox.get(0).getAttribute("value"));
		System.out.println(CheckBox.get(0).getAttribute("Checked"));
		
		CheckBox.get(0).click();
		System.out.println(CheckBox.get(0).getAttribute("Checked"));
		
	}

}
