package org.maventask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FebruryTaskExcell {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Asus\\eclipse-workspace\\MavenTask1\\src\\"
			+ "test\\resources\\ExcellFileNew\\Excel file12.xlsx");
	FileInputStream finput= new FileInputStream(f) ;
	Workbook wb=new XSSFWorkbook(finput);
	Sheet sheet = wb.getSheet("Excell file12");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(1);
	System.out.println(cell);
	
}
}
