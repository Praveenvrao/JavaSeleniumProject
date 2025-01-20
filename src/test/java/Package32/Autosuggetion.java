package Package32;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.support.ui.Select;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriverException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;

public class Autosuggetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@title = 'Search']")).sendKeys("Selenium");
		List <WebElement> searchlist = driver.findElements(By.xpath("//*[@id='Alh6id']//li"));
		System.out.println(searchlist);
		System.out.println(searchlist.size());
		
		
		for(int i=1;i<searchlist.size();i++) {
			System.out.println(searchlist.get(i).getText());
			if(searchlist.get(i).getText().equals("selenium testing")) {
				searchlist.get(i).click();
			}
		}
	}

}
