package org.maventask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTask1 {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\Asus\\eclipse-workspace\\MavenTask1\\src\\test\\"
			+ "resources\\ExcelFile\\Excel file11.xlsx");

	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("Data1");
	Row row = sheet.getRow(2);
	Cell cell = row.getCell(2);
	System.out.println(cell);
	
	int NumberOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println(NumberOfRows);
	int numberOfCells = row.getPhysicalNumberOfCells();
	System.out.println(numberOfCells);
	// To get and print particular row data
	for (int i = 0; i <numberOfCells ; i++) {
		Cell cell2 = row.getCell(i);
		System.out.println(cell2);
	}
// To get and print entire data from sheet
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row2 = sheet.getRow(i);
		{
		for (int j = 0; j <row2.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row2.getCell(j);
			
	
			int cellType = cell2.getCellType();
			System.out.println(cellType);
			if (cellType==1) {
				String stringCellValue = cell2.getStringCellValue();
				System.out.println(stringCellValue);
			}
			 if (cellType==0) {
				 if (DateUtil.isCellDateFormatted(cell2)) {
					 Date dateCellValue = cell2.getDateCellValue();
					SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy"); 
					String format = s.format(dateCellValue);
					System.out.println(format);
				} else {

				
				double numericCellValue = cell2.getNumericCellValue();
				long l= (long) numericCellValue;
				System.out.println(l);
			}}
		}
		
	}}
}
		
}
