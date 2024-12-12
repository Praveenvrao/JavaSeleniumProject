package Package28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

public class Navigationalcmnds {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		URL ornghrmurl = new URL("https://opensource-demo.orangehrmlive.com/");
		
		driver.navigate().to(ornghrmurl);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		
		Set <String> winhndls = driver.getWindowHandles();
		List <String> WinIDs = new ArrayList(winhndls);
		
		String parentid =  WinIDs.get(0);
		String childid = WinIDs.get(1);
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();

	}

}
