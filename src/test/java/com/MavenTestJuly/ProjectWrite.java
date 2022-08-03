package com.MavenTestJuly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProjectWrite extends ProjectGet {
	
	public static void writeDatas() throws IOException {
	

	File f = new File("./ExcelFiles/MLL230 New Balance-FTV2(VN)-Tong Hong(VN) Production Lot Final Shipment QC V10a 2021-10-31(Empty).xlsx");
	FileInputStream fis= new FileInputStream(f);
	Workbook wb= new XSSFWorkbook(fis);
	ProjectGet pg= new ProjectGet();
	String e=pg.ReadData();
	
	Sheet sheet = wb.getSheet("1");
	Row createRow = sheet.createRow(8);
	Cell createCell = createRow.createCell(2);
	createCell.setCellValue(e);
	FileOutputStream fos= new FileOutputStream(f);
	wb.write(fos);
}
	public static void main(String[]args) throws IOException {
		writeDatas();
		
	}

}