package Package40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;



public class DDTFileoutputdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook Workbook = new XSSFWorkbook();
		XSSFSheet sheet = Workbook.createSheet("Studentdata");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("StudentNo");
		row1.createCell(1).setCellValue("StudentName");
		row1.createCell(2).setCellValue("Stream");
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue(100);
		row2.createCell(1).setCellValue("John");
		row2.createCell(2).setCellValue("CSE");
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue(101);
		row3.createCell(1).setCellValue("Mitchel");
		row3.createCell(2).setCellValue("AI");
		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue(102);
		row4.createCell(1).setCellValue("Marsh");
		row4.createCell(2).setCellValue("EEE");
		
		FileOutputStream File = new FileOutputStream("C:\\Users\\91766\\eclipse-workspace\\JavaSeleniumProject\\src\\Tesdata\\outputfile1.xlsx");
		Workbook.write(File);
		Workbook.close();
		File.close();
		
		System.out.println("File is created and data entried");

		
		
		
		
		

	}

}
