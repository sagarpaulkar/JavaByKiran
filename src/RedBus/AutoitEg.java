package RedBus;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	driver.get("https://www.dropbox.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement frame=driver.findElement(By.xpath("//iframe[@id='consent-iframe']"));
	
	driver.switchTo().frame(frame);
	
	WebElement frame2=driver.findElement(By.xpath("//iframe[@id='ccpa-iframe']"));
	
	driver.switchTo().frame(frame2);
		
	driver.findElement(By.id("accept_all_cookies_button")).click();
	
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("skpaulkar@gmail.com");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Medrio$520");
	
	//driver.navigate().refresh();
	
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	
	
//	WebElement frame3=driver.findElement(By.xpath("//iframe[@id='usersurvey-iframe']"));
	
	//driver.switchTo().frame(frame3);
	
	driver.findElement(By.xpath("//span[text()='Upload files']")).click();
	
	//driver.findElement(By.xpath("//span[text()='Skip for now']")).click();
	
	Runtime.getRuntime().exec("D:/AutoIt/FileUpload.exe");
	
	//driver.switchTo().frame(frame2);
	
	
	
//	WebElement frame3=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
//	
//	driver.switchTo().frame(frame3);
//	
//	driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
//	
//	Set<String> s=driver.getWindowHandles();
//	Iterator<String> itr= s.iterator();
//	String pid=itr.next();
//	String cid=itr.next();
//	driver.switchTo().window(cid);
//	
//	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sagarpaulkar");
//	
//	driver.findElement(By.xpath("//*[text()='Next']")).click();
	
	
//	driver.findElement(By.id("file")).click();
//	Thread.sleep(3000);
//	Runtime.getRuntime().exec("D:/AutoIt/FileUpload.exe");
	
}
}