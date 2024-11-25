package Package24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//xpath with single element
		driver.findElement(By.xpath("//*[text()='Sell']")).click();
		
		//xpath with multiple attributes
		driver.findElement(By.xpath("//*[@id ='nav-logo-sprites' and @aria-label='Amazon.in']")).click();
		
		//xpath with text
		driver.findElement(By.xpath("//*[text() = 'Best Sellers']")).click();
		
		//xpath with contains
		driver.findElement(By.xpath("//*[contains(text(), 'Hot New Releases')]")).click();
		
		//Xpath with starts with
		driver.findElement(By.xpath("//*[starts-with(text(), 'Movers')]")).click();
	}

}
