import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestInputAlert {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://way2automation.com/way2auto_jquery/alert/input-alert.html");
		driver.findElement(By.xpath("html/body/button")).click();
	

	}

}
