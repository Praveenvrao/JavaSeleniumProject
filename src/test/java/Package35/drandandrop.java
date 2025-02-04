package Package35;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class drandandrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement US = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(washington, US).perform();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
