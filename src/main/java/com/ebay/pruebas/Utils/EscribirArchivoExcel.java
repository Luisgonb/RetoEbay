package com.ebay.pruebas.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.OutputStream;
import org.apache.groovy.ast.tools.ImmutablePropertyUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EscribirArchivoExcel {
	
	public EscribirArchivoExcel() {
		
	}

	public void WriteExcelFile(String filepath, String shetname, String[] dataToWrite) throws IOException {
	
		File file = new File (filepath);
		//@SuppressWarnings("resource")
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		XSSFSheet newSheet = newWorkbook.getSheet(shetname);
		int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();
		XSSFRow row= newSheet.getRow(0);
		XSSFRow newRow=newSheet.createRow(rowCount +1);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			XSSFCell newCell = newRow.createCell(i);
			newCell.setCellValue(dataToWrite[i]);
			}
		inputStream.close();
		FileInputStream outputStream = new FileInputStream(file);
		//newWorkbook.write(outputStream);
		outputStream.close();
		
	}

}
