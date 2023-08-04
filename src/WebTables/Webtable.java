package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();   
		driver.get("file:///C:/Users/Sagar%20Paulkar/Desktop/Selenium%20Workspace/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/users.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int rows= driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr")).size();
		System.out.println(rows);
		
		int cols= driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr[1]/th")).size();
		System.out.println(cols);
		
		for(int r=1;r<=rows;r++) {
			for (int c=1;c<=cols;c++) {
				String headings = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+r+"]/th["+c+"]")).getText();
				System.out.println("==>"+headings);
				}
				break;
			
			}
			System.out.println();
			     
			for(int r2=2;r2<=rows;r2++) {
			for (int c2=1;c2<=cols;c2++) {
						
			String data = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+r2+"]/td["+c2+"]")).getText();
			System.out.println("==>"+data);
						
			}
			System.out.println();
			}
					
				
	}
}
	
			
	

