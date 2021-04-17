import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebWindow
{
	public static void main(String[] args) throws Exception
	{
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.icicibank.com/aboutus/annual.page?#toptitle");
	
	driver.manage().window().maximize();
	
	Set<String> winids = driver.getWindowHandles();
	Iterator<String> iterate = winids.iterator();
	
	
	System.out.println("...........After the main tab open.............");

	driver.findElement(By.xpath(".//*[@id='about-us-desc']/div/div/table/tbody/tr[2]/td[1]/a")).click();
	
	winids = driver.getWindowHandles();
	iterate = winids.iterator();
	String Firstid = iterate.next();
	System.out.println("First window id :" +Firstid);
	
	String Secondid = iterate.next();
	System.out.println("Second window id :" +Secondid);
	}

}


