package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_Excel {

	public static void main(String[] args) {
		
		String flPath = "C:\\Users\\envy\\Desktop\\HSBC_Aug\\Demo.xlsx";
		
		try {
			
			Workbook wb;
			if(flPath.endsWith("xlsx")) {
				wb = new XSSFWorkbook(new FileInputStream(flPath));
			}else {
				wb = new HSSFWorkbook(new FileInputStream(flPath));
			}
			
			Sheet sht = wb.getSheet("Sheet1");
			
			int rc = sht.getLastRowNum();
			int cc = sht.getRow(0).getLastCellNum();
			
			for(int r=0;r<=rc;r++) {
				for(int c=0;c<cc;c++) {
					System.out.println(
							sht.getRow(r).getCell(c, MissingCellPolicy.CREATE_NULL_AS_BLANK).toString());
				}
			}
			wb.close();
			
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}






