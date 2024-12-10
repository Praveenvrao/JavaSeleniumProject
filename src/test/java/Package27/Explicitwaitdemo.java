package Package27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;

public class Explicitwaitdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement Username = exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//*[@placeholder='Username']"))));
		Username.sendKeys("Admin");
		
		WebElement password = exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Password']")));
		password.sendKeys("admin123");
		WebElement loginbtn = exwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		loginbtn.click();
		
		Thread.sleep(5000);
		
		String restitle = driver.getTitle();
		System.out.println(restitle);
		
		String acttitle = "OrangeHRM";
		if (acttitle == restitle) {
			System.out.println("Test passed - Succussfully logged in");
		} else 
			System.out.println("Testcase failed");
		driver.close();
		
		

	}

}
