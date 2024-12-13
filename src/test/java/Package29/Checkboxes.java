package Package29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Checkboxes {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@class ='form-check-input' and @type = 'checkbox']"));
		System.out.println(checkboxes.size());
		
		for (int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		
		for (WebElement CB :checkboxes) {
			CB.click();
		}
		
		for (int j =0; j<4;j++) {
			checkboxes.get(j).click();
		}
		
		WebElement monday = driver.findElement(By.xpath("//input[@id='monday']"));
		
		if(monday.isSelected()) {
			monday.click();
		}
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
