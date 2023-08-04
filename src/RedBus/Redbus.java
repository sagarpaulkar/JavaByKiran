                                                                                                                                                 package RedBus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Redbus {
	@Test
	public void test() throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("account_dd")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("user_sign_in_sign_up")).click();
		Thread.sleep(2000);
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		
		driver.switchTo().frame(frame);
		driver.findElement(By.id("mobileNoInp")).sendKeys("1234567890");
		
		Thread.sleep(3000);
		
		WebElement frame2=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));		
		driver.switchTo().frame(frame2);		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
		
		String parentWindow= driver.getWindowHandle();		
		Set<String> wind=driver.getWindowHandles();		
		for(String win:wind) {
		if(!win.equals(parentWindow)) {
		driver.switchTo().window(win);
		System.out.println(win);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("identifierId")).sendKeys("123456");
		}
		}
}
}