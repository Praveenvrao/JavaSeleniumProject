package Package40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Dynamictablecreationdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook Workbook = new XSSFWorkbook();
		XSSFSheet sheet = Workbook.createSheet("Dynamicdata");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows?");
		int noofrows = sc.nextInt();
		System.out.println("Number of cells?");
		int noofcells = sc.nextInt();
		
		for (int r=0; r<=noofrows;r++)
		{
			XSSFRow currentrow = sheet.createRow(r);
			for(int c=0; c<noofcells;c++) {
				XSSFCell cell = currentrow.createCell(c);
				System.out.println("Enter row number "+r+"cell number"+c);
				cell.setCellValue(sc.next());
			}
		}
		
		System.out.println("File is created");
		
		FileOutputStream File = new FileOutputStream("C:\\\\Users\\\\91766\\\\eclipse-workspace\\\\JavaSeleniumProject\\\\src\\\\Tesdata\\\\dynamicoutput2.xlsx");
		Workbook.write(File);
		Workbook.close();
		File.close();

	}

}
