import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Webdriver_Jars\\Software\\New folder\\geckodriver.exe");
		WebDriver driver=new  FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("http://www.wiktionary.org");
		
		//driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("English");
		
		Select select  = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		//select.selectByVisibleText("Deutsch");
		//select.selectByIndex(3);
		select.selectByValue("hi");
		
		/*List<WebElement> options = select.getOptions();
		
		System.out.println(options.size());
		for(int i = 0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}*/
/*List<WebElement> optins = driver.findElements(By.tagName("optins"));
		
		System.out.println(optins.size());
		for(int i = 0; i<optins.size(); i++)
		
			System.out.println(optins.get(i).getAttribute("lang"));
		}*/
		
	/*	System.out.println(".............Printing All Links..........");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		for(int i = 0; i<link.size(); i++)
		{
			System.out.println(link.get(i).getAttribute("href"));
		}
		System.out.println("Total Links Are:  "+link.size());
	}*/
		System.out.println(".............Printing All Links..........");
		
		WebElement elementblock = driver.findElement(By.xpath("//*[@id='www-wiktionary-org']/div[10]"));
		
		List<WebElement> link = elementblock.findElements(By.tagName("a"));
		
		System.out.println("Total Links Are:  "+link.size());
		
		for(int i = 0; i<link.size(); i++)
		{
			System.out.println(link.get(i).getText());
		}
		
	}
}
