import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TeastAuthenticateCredentials {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gredev:nearlyhere@getproactiv-ca.stg01.grdev.com");
		Thread.sleep(2000);
		
		

	}

}
