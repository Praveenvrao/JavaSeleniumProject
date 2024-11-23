package Package21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Sampletestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
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
