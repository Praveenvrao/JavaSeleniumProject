package Package26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		//Gettitle
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//*[@target=\"_self\" and @href=\"/\"]/following::a[1]")).click();
		driver.findElement(By.xpath("//span[text()='youtube']")).click();
		
		//System.out.println(driver.getWindowHandles());

	}

}
