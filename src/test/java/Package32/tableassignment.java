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

public class tableassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		WebElement depcity = driver.findElement(By.xpath("//select[@name = 'fromPort']"));
		Select depcitydropdown = new Select(depcity);
		
		depcitydropdown.selectByValue("Mexico City");
		 WebElement descity = driver.findElement(By.xpath("//select[@name = 'toPort']"));
		 Select descitydropdown = new Select(descity);
		 
		 descitydropdown.selectByValue("Berlin");
		 driver.findElement(By.xpath("//*[@value = 'Find Flights']")).click();
		 

	}

}
