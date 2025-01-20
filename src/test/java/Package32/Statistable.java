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

public class Statistable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		//total table data
		List <WebElement> table = driver.findElements(By.xpath("//*[@name='BookTable']//tr"));
		System.out.println(table.size());
		
		/*for (int i=1;i<table.size();i++) {
			System.out.println(table.get(i).getText());
		}*/
		
		List <WebElement> cols = driver.findElements(By.xpath("//*[@name='BookTable']//tr//th"));
		
		for(int r=2;r<=table.size();r++){
			for(int c=1;c<=cols.size();c++) {
				
				String value = driver.findElement(By.xpath("//*[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value + '\t');
			}
			System.out.println();
		}
		

	}

}
