package Package39;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chromium.*;

import java.time.Duration;
import java.util.List;
import java.io.IOException;
import java.net.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Brokenlinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		System.out.println(Alllinks.size());
		
		int brokenlinknumber = 0;
		for(WebElement link:Alllinks) {
			String hrefV = link.getAttribute("href");
			if(hrefV==null || hrefV.isEmpty()) {
				System.out.println("Its not a valid link unable to proceed");
				continue;
			}
			try {		
				URL linkURL = new URL(hrefV);//converting href value to URL
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); //opening the server connection 
				conn.connect(); //connecting and sent request to server
				
				if(conn.getResponseCode()>=400) {
					System.out.println(hrefV + "=========> Broken link");
					brokenlinknumber++;
				}else {
					System.out.println(hrefV +"=========> Not a broken link");
				}
				
			}
			catch(Exception e) {
	
			}
			
		}
		System.out.println("Number of broken links ====> "+ brokenlinknumber);
		Thread.sleep(3000);
		driver.quit();
		

	}

}
