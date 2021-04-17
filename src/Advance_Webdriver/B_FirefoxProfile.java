package Advance_Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class B_FirefoxProfile {

	public static void main(String[] args) {
		
		ProfilesIni listprofiles = new ProfilesIni();
		FirefoxProfile profile = listprofiles.getProfile("selenium");
		FirefoxProfile profile1 = listprofiles.getProfile("default");
		
		WebDriver driver = new FirefoxDriver(profile);
		WebDriver driver1 = new FirefoxDriver(profile1);
		driver.get("http://way2automation.com");
		driver1.get("http://gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver1.getTitle());
	}

}
