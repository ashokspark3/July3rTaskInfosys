package org.maventask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatRowColumn {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\"
				+ "MavenTask1\\\\src\\\\test\\\\resources\\\\ExcelFile\\\\"
				+ "new file10.xlsx");
		Workbook work=new XSSFWorkbook();
		Sheet createSheet = work.createSheet("ashok");
		Row R = createSheet.createRow(0);
		Cell createCell = R.createCell(0);
		createCell.setCellValue("NAME");
		Cell createCell2 = R.createCell(1);
		createCell2.setCellValue("BANK");
		Cell createCell3 = R.createCell(2);
		createCell3.setCellValue("BRANCH");
		Cell createCell4 = R.createCell(3);
		createCell4.setCellValue("BALANCE");
		Row R1 = createSheet.createRow(1);
		Cell createCell5 = R1.createCell(0);
		createCell5.setCellValue("ashok");
		Cell createCell6 = R1.createCell(1);
		createCell6.setCellValue("SBI");
		Cell createCell7 = R1.createCell(2);
		createCell7.setCellValue("A.NAGAR");
		Cell createCell8 = R1.createCell(3);
		createCell8.setCellValue("200000");
		Row R3 = createSheet.createRow(2);
		Cell createCell9 = R3.createCell(0);
		createCell9.setCellValue("AK");
		Cell createCell10 = R3.createCell(1);
		createCell10.setCellValue("IOB");
		Cell createCell11 = R3.createCell(2);
		createCell11.setCellValue("T.NAGAR");
		Cell createCell12 = R3.createCell(3);
		createCell12.setCellValue("50000");
		 Row R4 = createSheet.createRow(3);
		Cell createCell13 = R4.createCell(0);
		createCell13.setCellValue("KAVYA");
		Cell createCell14 = R4.createCell(1);
		createCell14.setCellValue("KOTAK");
		Cell createCell15 = R4.createCell(2);
		createCell15.setCellValue("DIPPO");
		Cell createCell16 = R4.createCell(3);
		createCell16.setCellValue("50000");
		Row R5 = createSheet.createRow(4);
		Cell createCell17 = R5.createCell(0);
		createCell17.setCellValue("SUGAMADHI");
		Cell createCell18 = R5.createCell(1);
		createCell18.setCellValue("ICICI");
		Cell createCell19 = R5.createCell(2);
		createCell19.setCellValue("WEST ROAD");
		Cell createCell20 = R5.createCell(3);
		createCell20.setCellValue("500000");
		
		
		
		
//		String cellValue = createCell.getStringCellValue();
//		if (cellValue.equals("ashok")) {
//			createCell.setCellValue("arun");
//		}


		FileOutputStream f3=new FileOutputStream(f1);
			
			work.write(f3);
	}

}
