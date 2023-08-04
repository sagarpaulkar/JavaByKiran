package Dropbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AutoitEg {
	
	@Test
	public void autoit() throws Exception {
		
	
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("start-maximized");
	System.setProperty("webdriver.chrome.driver","chromedriverAutoIT.exe");
	WebDriver driver= new ChromeDriver(options);
	
	driver.get("http://javabykiran.com/playground/file-upload");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("file")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("D:/AutoIt/FileUpload.exe");
	
}
}