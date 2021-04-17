import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CaptureScreenShot extends SendMailUsingAuthentication {

	public static void main(String[] args) throws Exception {
		
		SendMailUsingAuthentication mail = new SendMailUsingAuthentication();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.gmail.com");
		//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("meenakshi.patil04@gmail.com");
		//File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcfile,new File("D:\\Screenshot.jpg"));
		try{
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("meenakshi.patil04@gmail.com");
		driver.findElement(By.xpath("//*[@id='next']")).click();
	    driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("Meenu@676");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("D:\\Screenshot\\screenshot3.jpg"));
		mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt, SendMailUsingAuthentication.SMTP_AUTH_USER);
		}
		catch(Exception e)
		{
		System.out.println("gmail not found: " + e.getMessage());
		}
	
	}

}
