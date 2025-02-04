package Package35;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("iframeResult");
		WebElement doubleclick = driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
