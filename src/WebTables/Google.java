package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("gb_h")).click();
		
		WebElement app = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(app);
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='CgwTDb']"));
		System.out.println(names.size());
		
		driver.findElement(By.xpath("//li[8]/a/span")).click();
	}

}
