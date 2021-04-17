import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Captcha {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");

		driver.manage().window().maximize();

		String capcha = driver.findElement(By.xpath("//*[@id='ebcaptchatext']")).getText();

		System.out.println(capcha);

		String regex = "[^\\d]+";
		String[] str = capcha.split(regex);
		int calculatecapcha = Integer.parseInt(str[1]) + Integer.parseInt(str[2]);
		System.out.println(calculatecapcha);

		String getcapcha = String.valueOf(calculatecapcha);

		driver.findElement(By.xpath("//*[@id='ebcaptchainput']")).sendKeys(getcapcha);
		driver.findElement(By.xpath("//*[@id='form']/input[2]")).click();

	}

}
