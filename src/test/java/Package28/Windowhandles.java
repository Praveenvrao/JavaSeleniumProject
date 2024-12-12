package Package28;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://www.orangehrm.com']"))).click();
		
		Set <String> Winhd = driver.getWindowHandles();
		List <String> WHandles = new ArrayList(Winhd);
		
		for (String Handles:Winhd) {
			String title = driver.switchTo().window(Handles).getTitle();
			System.out.println(title);
			if((title.equals("Human Resources Management Software | OrangeHRM")) || (title.equals("OrangeHRM"))){
				driver.close();
				//WebElement Linkedin = exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt ='linkedin logo']")));
				//Linkedin.click();
			}
		}
		
		System.out.println(WHandles);
		
		

	}

}
