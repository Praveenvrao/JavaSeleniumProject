package Package23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		//tag.classname[attribute]
		driver.findElement(By.cssSelector("a.cb-hm-mnu-itm[title='Live Cricket Score']")).click();
		
		//tag#id
		driver.findElement(By.cssSelector("a#international-tab")).click();
		
		//tag[attribute]
		driver.findElement(By.cssSelector("a[title='Domestic']")).click();
		
		driver.quit();
		
		

	}

}
