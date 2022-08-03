package com.MavenTestJuly;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelTest { 
	
public static void  readFile() throws IOException {
	
	
	File f= new File("D:\\datadriven read.xlsx");
    FileInputStream fis= new FileInputStream(f);
    Workbook wb= new XSSFWorkbook(fis);
    Sheet s = wb.getSheetAt(0);
    int rowSize = s.getPhysicalNumberOfRows();
    
    for (int i = 0; i < rowSize; i++) {
    	Row row = s.getRow(i);
    	int cellSize = row.getPhysicalNumberOfCells();
    	
    for (int j = 0; j < cellSize; j++) {
    	Cell cell = row.getCell(j);
    	CellType type = cell.getCellType();
    	
        if (type.equals(CellType.STRING)) {
        	String stringCellValue = cell.getStringCellValue();
        	System.out.println(stringCellValue);
        }
        else if (type.equals(CellType.NUMERIC)) {
        	double numericCellValue = cell.getNumericCellValue();
        	int val=(int)numericCellValue;
        	System.out.println(val);
        	
			
		} 
					    			
	}
		
	}
    
    
	}	

    
    
    
}
    

