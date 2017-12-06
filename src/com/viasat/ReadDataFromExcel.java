package com.viasat;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel {

	@Test
	public void connectExcel() throws Exception {
		
		File src = new File("D:\\Users\\Saif\\eclipse-workspace\\ViaSat\\TestData\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		
		
		for (int i =0; i<=rows;i++) {
			String user=sheet.getRow(i).getCell(0).getStringCellValue();
		//	String pass=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(user);
			//System.out.println(pass);
		}wb.close();

	}
}