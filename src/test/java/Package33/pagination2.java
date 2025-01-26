package Package33;

import java.time.Duration;
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

public class pagination2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@class ='parent collapsed' and normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		String pages = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		int pagescount =Integer.parseInt(pages.substring(pages.indexOf('(')+1, pages.indexOf("Pages")-1));
		System.out.println(pagescount);
		
		for (int p =1;p<=pagescount;p++) {
			
			if(p>1) {
				driver.findElement(By.xpath("//li[normalize-space() ='+p+']")).click();
			}
			
		// reading the data from active table
			int tablerows = driver.findElements(By.xpath("//tbody//tr")).size();
			for(int i=1;i<=10;i++) {
				String Customername = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[2]")).getText();
				String email = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[3]")).getText();
				System.out.println(Customername + "/t" + email);
				System.out.println();
			}
		}
		driver.quit();

	}

}
