package com.viasat;

import java.io.File;
import java.io.FileInputStream;

//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;

	/*
	 * HSSFWorkbook wb; //for .xls files HSSFSheet sheet1;
	 */
	public ExcelDataConfig(String excelPath) {

		try {

			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);

			// wb = new HSSFWorkbook(fis); //for .xls files

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public String getData(int sheetNumber, int row, int column) {
		sheet1 = wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();

		return data;
	}

	public int getRowCount(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
}