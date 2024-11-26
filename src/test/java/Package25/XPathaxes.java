package Package25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		//XPath axes - using following 
		driver.findElement(By.xpath("//*[@target=\"_self\" and @href=\"/\"]/following::a[1]")).click();
		
		//Xpath axes- following siblings
		driver.findElement(By.xpath("//a[@id='all-tab']/following-sibling::a[last()]")).click();
		
		//Xpath axes - preceding sibling
		driver.findElement(By.xpath("//a[@id='domestic-tab']/preceding-sibling::a[1]")).click();
		
		//Xpath axes - preceding
		driver.findElement(By.xpath("//a[@id='league-tab']/preceding::a[@title=\"Live Matches\"]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Live Scores']")).click();
		
		//following sibling
		driver.findElement(By.xpath("//a[normalize-space()='Live Scores']/following-sibling::div[1]")).click();
		

	}

}
