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

public class Selectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement dropdownele = driver.findElement(By.xpath("//select[@id='country']"));
		Select countrydropdown = new Select(dropdownele);
		
		countrydropdown.selectByVisibleText("Canada");
		List<WebElement>Dropdownoptions = countrydropdown.getOptions();
		System.out.println(Dropdownoptions.size());
		
		/*for(int i=0;i<Dropdownoptions.size(); i++) {
			System.out.println(Dropdownoptions.get(i).getText());
		}*/
		
		for(WebElement OP : Dropdownoptions) {
			System.out.println(OP.getText());
		}
		
	}

}
