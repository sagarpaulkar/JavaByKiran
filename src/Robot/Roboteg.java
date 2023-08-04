package Robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Roboteg {

	
	@Test
	public void robotEx() throws Exception {
		
	System.setProperty("webdriver.chrome.driver","chromedriverAutoIT.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("C:\\\\Users\\\\Sagar Paulkar\\\\Desktop\\\\Selenium Workspace\\\\Selenium Softwares\\\\Selenium Softwares\\\\Offline Website\\\\index.html");
	driver.manage().window().maximize();
	
	WebElement logo= driver.findElement(By.tagName("img"));
	Actions act= new Actions(driver);
	act.contextClick(logo).build().perform();
	
	Thread.sleep(4000);
	
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(4000);
	
	r.keyPress(KeyEvent.VK_ENTER);
}
}