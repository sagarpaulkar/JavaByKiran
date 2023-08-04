package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("file:///C:/Users/Sagar%20Paulkar/Desktop/Selenium%20Workspace/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/add_user.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("Sagar");
		driver.findElement(By.id("mobile")).sendKeys("9922774123");
		driver.findElement(By.id("email")).sendKeys("skpsqa@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Java");
		driver.findElement(By.id("Male")).click();
		
		WebElement states = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select s= new Select(states);
		List<WebElement> state = s.getOptions();
		int stateName= state.size();
		for(int i=0; i<=stateName-1;i++) {
			String allstate=state.get(i).getText();
			System.out.println(allstate);
			
		}
		for(int j=0;j<=stateName-1;j++)
		{
			 String pstate = state.get(j).getText();
			 if(pstate.contains("Delhi"))
			System.out.println("State Present"+"="+pstate);
		}
	}

}
