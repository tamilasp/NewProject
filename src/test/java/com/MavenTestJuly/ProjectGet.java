package com.MavenTestJuly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProjectGet {
	
	public static String ReadData() throws IOException {
		File f= new File("./ExcelFiles/SATRA POUHUNG 7.19.2022.xlsx");
	    FileInputStream fis= new FileInputStream(f);
	    Workbook wb= new XSSFWorkbook(fis);
	    Sheet sheetAt = wb.getSheetAt(0);
	    Row row = sheetAt.getRow(2);
	    Cell cell = row.getCell(4);
	    System.out.println(cell);
	   // System.out.println("done");
		return null;
	    

	}
	public static void main1(String[]args) throws IOException {
		ReadData();
		
	
	
		
	}

}
