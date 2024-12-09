package Package27;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Sleepdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(10000);
		driver.close();
		
		
		

	}

}
