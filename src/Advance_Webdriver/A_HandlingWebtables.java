package Advance_Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A_HandlingWebtables {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/cricket-scorecard/10719");
	   driver.manage().window().maximize();
		//Row data column count
		String xp_start  = ".//*[@id='innings_1']/div[1]/div[";
		String xp_end = "]/div[1]";
		
		  Thread.sleep(2000);
		  
		int rownum = 0;
		for(int i=1; i<=11; i++){
			String x = driver.findElement(By.xpath(xp_start + i + xp_end)).getText();
			rownum++;
			System.out.println(x);
		}
		System.out.println("Row count is : "+rownum);
driver.close();
	}

}
