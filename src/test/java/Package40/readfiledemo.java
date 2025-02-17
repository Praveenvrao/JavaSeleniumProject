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

public class readfiledemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream File = new FileInputStream("C:\\Users\\91766\\eclipse-workspace\\JavaSeleniumProject\\src\\Tesdata\\dynamicoutput2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(File);
		XSSFSheet sheet = workbook.getSheetAt(0);
		//XSSFRow row = sheet.getRow(1);
		//System.out.println(row.getCell(2));
		int rownum = sheet.getLastRowNum();
		int cellnum = sheet.getRow(1).getLastCellNum();
		
		for(int r =0;r<=rownum;r++) {
			for(int c = 0;c<cellnum;c++) {
				XSSFCell cellvalue = sheet.getRow(r).getCell(c);
				System.out.print(cellvalue.toString() + "\t");
			}
			System.out.println("  ");
		}
		workbook.close();
		File.close();

	}

}
