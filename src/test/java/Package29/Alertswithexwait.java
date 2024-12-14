package Package29;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;

public class Alertswithexwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert Promptalert = exwait.until(ExpectedConditions.alertIsPresent());
		Promptalert.sendKeys("CONGRATS");
		Promptalert.accept();
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
