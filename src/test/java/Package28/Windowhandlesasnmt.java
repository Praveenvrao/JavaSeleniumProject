package Package28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandlesasnmt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'wikipedia-search-input']"))).sendKeys("Selenium");
		exwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'wikipedia-search-button']"))).click();
		Thread.sleep(3000);
		List <WebElement> searchres = driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']/a"));
		System.out.println(searchres.size());
		
		for (WebElement res : searchres) {
			res.click();
			System.out.println(res.getText());
		}
		
		Set <String> winhd = driver.getWindowHandles();
		List <String> WH = new ArrayList(winhd);
		System.out.println(WH);
		
		for (String WHandles : WH) {
			String title = driver.switchTo().window(WHandles).getTitle();
			
			if ((title.equals("Selenium - Wikipedia")) || (title.equals("Selenium in biology - Wikipedia"))){
				driver.close();
			}
		}
		
		driver.quit();
	}

}
