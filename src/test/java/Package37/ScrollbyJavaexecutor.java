package Package37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyJavaexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://history.state.gov/countries/all");
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,2000)", "");
		System.out.println(JS.executeScript("return window.pageYOffset", ""));
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)", args);
		System.out.println(JS.executeScript("return window.pageYOffset",""));
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(0,-document.body.scrollHeight)", args);
		System.out.println(JS.executeScript("return window.pageYOffset",""));
		driver.close();

		
}
}
