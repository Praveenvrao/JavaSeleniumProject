package Package37;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class Javascriptexecutordemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement orginc = driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		WebElement admin = driver.findElement(By.xpath("//input[@placeholder='用户名']"));
		WebElement paswd = driver.findElement(By.xpath("//input[@placeholder='密码']"));
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		String mainwindow = driver.getWindowHandle();
		JS.executeScript("arguments[0].click()", orginc);
		driver.switchTo().window(mainwindow);
		JS.executeScript("arguments[0].setAttribute('value','Admin')", admin);
		JS.executeScript("arguments[0].setAttribute('value','admin123')", paswd);
		
		
		


	}

}
