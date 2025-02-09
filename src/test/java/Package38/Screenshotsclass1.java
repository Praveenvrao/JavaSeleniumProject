package Package38;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshotsclass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot SS = (TakesScreenshot) driver;
		driver.get("https://www.cricbuzz.com/");
		File sourcefile = SS.getScreenshotAs(OutputType.FILE);
		File fileplace = new File("C:\\Users\\91766\\eclipse-workspace\\JavaSeleniumProject\\src\\test\\resources\\Testscreenshots\\fullscreenshot1.png");
		sourcefile.renameTo(fileplace);
		Thread.sleep(2000);
		
		//Webelement screenshot
		WebElement scoreheader = driver.findElement(By.xpath("//ul[@class='cb-col cb-col-100 videos-carousal-wrapper cb-mtch-crd-rt-itm']"));
		File sourcefile2 = scoreheader.getScreenshotAs(OutputType.FILE);
		File WEtargetplace = new File("C:\\Users\\91766\\eclipse-workspace\\JavaSeleniumProject\\src\\test\\resources\\Testscreenshots\\Webelementss1.png");
		sourcefile2.renameTo(WEtargetplace);
		driver.quit();
		
		

	}

}
