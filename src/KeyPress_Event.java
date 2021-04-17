import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class KeyPress_Event {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("meenakshi.patil04@gmail.com");
		 driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		 
		 driver.findElement(By.id("Email")).sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.id("Passwd")).sendKeys("Meenu@676");
		 driver.findElement(By.id("Passwd")).sendKeys(Keys.ENTER);
		 driver.close();
		 

	}

}
