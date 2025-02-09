package Package38;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;

public class SSLprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		String title = driver.getTitle();
		
		if(title.equals("expired.badssl.com")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test FAILED");
		}
		driver.quit();
		

	}

}
