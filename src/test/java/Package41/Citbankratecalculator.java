package Package41;

import org.openqa.selenium.chromium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

public class Citbankratecalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
		String Filepath = "C:\\Users\\91766\\eclipse-workspace\\JavaSeleniumProject\\src\\Tesdata\\citbankratecal.xlsx";
		int rows = excelutilitymethods.getrowcount(Filepath, "Sheet1");
		System.out.println(rows);
		for (int i =1; i<=rows;i++){
			
			//getting the data from sheet
			String IDA = excelutilitymethods.getcelldata(Filepath, "Sheet1", i, 1);
			String LCD = excelutilitymethods.getcelldata(Filepath, "Sheet1", i, 2);
			String IR = excelutilitymethods.getcelldata(Filepath, "Sheet1", i, 3);
			String Compounding = excelutilitymethods.getcelldata(Filepath, "Sheet1", i, 4);
			String Total = excelutilitymethods.getcelldata(Filepath, "Sheet1", i, 5);
			
			//enetring the data
			WebElement Amount = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			Amount.clear();
			Amount.sendKeys(IDA);
			WebElement Months = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			Months.clear();
			Months.sendKeys(LCD);
			WebElement Interest = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			Interest.clear();
			Interest.sendKeys(IR);
			Select COMP = new Select(driver.findElement(By.xpath("//div[@id='mat-select-value-1']")));
			COMP.selectByVisibleText(Compounding);
			
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
			
			
			//Validation
			String acttotal = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			if (Double.parseDouble(acttotal) == Double.parseDouble(Total)){
				System.out.println("Test passed");
				excelutilitymethods.setcelldata(Filepath, "Sheet1", i, 6, acttotal);
				excelutilitymethods.setcelldata(Filepath, "Sheet1", i, 7, "PASS");
			}else {
				System.out.println("Test FAIL");
				excelutilitymethods.setcelldata(Filepath, "Sheet1", i, 6, acttotal);
				excelutilitymethods.setcelldata(Filepath, "Sheet1", i, 7, "FAIL");
			}
			
		}
		Thread.sleep(3000);
		
		
		

	}

}
