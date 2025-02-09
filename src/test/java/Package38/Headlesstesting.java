package Package38;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.cricbuzz.com/");
		String act_title = driver.getTitle();
		System.out.println(act_title);

		
		if (act_title.equals("Live Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.close();

	}

}
