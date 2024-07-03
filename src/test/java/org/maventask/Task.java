package org.maventask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main(String[] args) throws IOException {
//	WebDriver d=new ChromeDriver();
//	d.get("https://moviesmod.vip/");
//	d.manage().window().maximize();
//
//	FileUtils f=new FileUtils();
	
	
	File f=new File("C:\\Users\\Asus\\eclipse-workspace\\MavenTask1\\src\\test\\resources\\ExcelFile\\Excel file11.xlsx");
	FileInputStream s=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(s);
	Sheet sheet = w.getSheet("Data1");
	Row row = sheet.getRow(2);
	Cell cell = row.getCell(1);
	System.out.println(cell);
	System.out.println("*******************************************************");

	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	System.out.println(physicalNumberOfCells);
	System.out.println("*******************************************************");
	Cell cell3 = row.getCell(2);
	String stringCellValue = cell3.getStringCellValue();
	if (stringCellValue.equals("c")) {
		cell3.setCellValue("ashok2");
	}
	System.out.println("*******************************************************");

	
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		Row row2 = sheet.getRow(i);
		{
		for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row2.getCell(j);
			System.out.println(cell2);
		}}}	
	System.out.println("*******************************************************");
	
//creat excell file	
	File f1=new File("C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\MavenTask1\\\\src\\\\test\\\\resources\\\\ExcelFile\\\\new file10.xlsx");
Workbook work=new XSSFWorkbook();
Sheet createSheet = work.createSheet("ashok");
Row R = createSheet.createRow(4);
Cell createCell = R.createCell(4);
createCell.setCellValue("ashok");

String cellValue = createCell.getStringCellValue();
if (cellValue.equals("ashok")) {
	createCell.setCellValue("arun");
}


FileOutputStream f3=new FileOutputStream(f1);
	
	work.write(f3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
