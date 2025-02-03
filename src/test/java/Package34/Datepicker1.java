package Package34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker1 {
	
	static void datepicker(WebDriver driver, String YEAR, String MONTH, String DATE) {
		
		driver.findElement(By.xpath("//input[@name='dob']")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectyear = new Select(year);
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectmonth = new Select(month);
		selectyear.selectByVisibleText(YEAR);
		selectmonth.selectByVisibleText(MONTH);
		List <WebElement> Alldates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for(WebElement date: Alldates) {
			if(date.getText().equals(DATE)){
				date.click();
			}
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@class=' nav-item-child ffb-ark-first-level-menu ' and normalize-space()='Buy Ticket']")).click();
		driver.findElement(By.xpath("//input[@id='product_549']")).click();
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("David");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Warner");
		driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("Creating dummy Visa ticket");
		
		String Reqyear = "2001";
		String Reqmonth = "Jul";
		String Reqdate ="13";
		datepicker(driver,Reqyear,Reqmonth,Reqdate);
		
		driver.findElement(By.xpath("//input[@id='sex_1']")).click();
		driver.findElement(By.xpath("//input[@id='traveltype_1']")).click();
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Delhi");
		datepicker(driver,"2025","Jul", "13");
		
		driver.findElement(By.xpath("//input[@id='deliverymethod_2']")).click();
		driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("Infosys");
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("9787986543");
		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("ticketsmail@mail.com");
		
		WebElement Country = driver.findElement(By.xpath("//span[@id='select2-billing_country-container']"));
		Select countryselection = new Select(Country);
		countryselection.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Street address 1");
		driver.findElement(By.xpath("//input[@id='billing_address_2']")).sendKeys("Street address 2");
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Hyderbad");
		WebElement Billingstates = driver.findElement(By.xpath("//span[@id='select2-billing_state-container']"));
		Select billingstate = new Select(Billingstates);
		billingstate.selectByVisibleText("Telangana");
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("506123");
		driver.findElement(By.xpath("//button[@id='place_order']")).click();
		
		

	}

}
