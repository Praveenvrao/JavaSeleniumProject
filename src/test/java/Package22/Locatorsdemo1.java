package Package22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Locatorsdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		//id
		//boolean logostatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logostatus);
		
		//Name
		driver.findElement(By.name("newsletter")).sendKeys("ABCDmail");
		*/
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Linktext
		//driver.findElement(By.linkText("MX Player")).click();
		
		//Partial link text
		//driver.findElement(By.partialLinkText("Import")).click();
		
		//classname
		List <WebElement> topheads = driver.findElements(By.className("nav-progressive-content"));
		System.out.println(topheads);
		System.out.println(topheads.size());
		
		//Tagname
		List <WebElement> imglinks = driver.findElements(By.tagName("img"));
		System.out.println(imglinks);
		System.out.println(imglinks.size());
		
		driver.quit();
	}

}
