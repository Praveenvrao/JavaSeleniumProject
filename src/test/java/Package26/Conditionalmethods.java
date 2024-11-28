package Package26;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Conditionalmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		boolean Title = driver.findElement(By.xpath("//span[normalize-space()='For Selenium, Cypress & Playwright']")).isDisplayed();
		System.out.println(Title);
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='female']"));
		boolean male_rbutton = driver.findElement(By.xpath("//input[@id='male']")).isSelected();
		System.out.println(male_rbutton);
		if(male_rbutton == true) {
			male_rd.click();
		} else {
			female_rd.click();
		}
		
		boolean field1 = driver.findElement(By.xpath("//input[@id='field1']")).isEnabled();
		System.out.println(field1);
		
		Thread.sleep(100);
		driver.close();

	}

}
