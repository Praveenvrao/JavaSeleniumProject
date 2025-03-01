package Package41;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

public class excelutilitymethods {
	
	public static FileInputStream FI;
	public static FileOutputStream FO;
	public static XSSFWorkbook WB;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle cellstyle;
	
	public static int getrowcount(String XLFile, String xlsheet) throws IOException {
		FI = new FileInputStream(XLFile);
		WB = new XSSFWorkbook(FI);
		sheet = WB.getSheet(xlsheet);
		int rowcount = sheet.getLastRowNum();
		WB.close();
		FI.close();
		return rowcount;
	}
	public static int getcellcount(String XLFile,String xlsheet ) throws IOException {
		FI = new FileInputStream(XLFile);
		WB = new XSSFWorkbook(FI);
		sheet = WB.getSheet(xlsheet);
		int cellcount = sheet.getRow(0).getLastCellNum();
		WB.close();
		FI.close();
		return cellcount;
		
	}
	public static String getcelldata(String XLFile, String xlsheet, int rownum, int cellnum )throws IOException{
		FI = new FileInputStream(XLFile);
		WB = new XSSFWorkbook(FI);
		sheet = WB.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		String data;
		try {
			data = cell.toString();
		}
		catch (Exception e) {
			data = "";
		}
		WB.close();
		FI.close();
		return data;
		
	}
	public static void setcelldata(String XLFile, String xlsheet,int rownum, int colnum, String data )throws IOException{
		FI = new FileInputStream(XLFile);
		WB = new XSSFWorkbook(FI);
		sheet = WB.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		FO = new FileOutputStream(XLFile);
		WB.write(FO);
		WB.close();
		FI.close();
		FO.close();
	}
	
	
	
	

}
