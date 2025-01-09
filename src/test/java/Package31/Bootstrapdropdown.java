package Package31;

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


public class Bootstrapdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//span[@class ='multiselect-selected-text']")).click();
		
		//selecting single option
		//driver.findElement(By.xpath("//input[@value ='jQuery']")).click();
		
		//selecting multiple options
		List<WebElement>options = driver.findElements(By.xpath("//*[@class ='multiselect-container dropdown-menu']//label"));
		System.out.println(options.size());
		
		for (int i=0;i<options.size();i++) {
			//System.out.println(options.get(i).getText());
			if ((options.get(i).getText().equals("Java")) || (options.get(i).getText().equals("Python")) || (options.get(i).getText().equals("Oracle")) ) {
				options.get(i).click();
			}
		}
		
		for (WebElement op : options) {
			System.out.println(op.getText());
		}

	}

}
