package Package36;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class keyboardaction2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement register = driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(register).perform();
		List<String> ids = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("THOMOS");
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//a[@class='btn btn-white btn-lg']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
