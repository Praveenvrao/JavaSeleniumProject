package Package36;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class keyboradactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to the programming");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
