package com.MavenTestJuly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	public static void writeData() throws Exception {
		
	File f = new File("D:\\Book1.xlsx");
	FileInputStream fis= new FileInputStream(f);
	Workbook wb= new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row = sheetAt.createRow(11);
	Cell createCell = row.createCell(11);
	createCell.setCellValue("username");
	sheetAt.getRow(11).createCell(12).setCellValue("password");
	sheetAt.createRow(12).createCell(11).setCellValue("Tamil");
	sheetAt.getRow(12).createCell(12).setCellValue(234454598);
	sheetAt.createRow(13).createCell(11).setCellValue("vinod");
	FileOutputStream fos= new FileOutputStream(f);
	wb.write(fos);
	System.out.println("done");
		
	}
	public static void main(String[] args) throws Exception {
		writeData();
		
	}

}
