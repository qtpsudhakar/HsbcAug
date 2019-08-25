package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateData_Excel {

	public static void main(String[] args) {

		try {

			String flPath = "C:\\Users\\envy\\Desktop\\HSBC_Aug\\output.xlsx";
			
			Workbook wb = new XSSFWorkbook(new FileInputStream(flPath));
			Sheet sht = wb.getSheet("demo");
			
			Row r1 = sht.createRow(2);
			r1.createCell(0).setCellValue("1");
			r1.createCell(1).setCellValue("selenium");
			r1.createCell(2).setCellValue("123456");

			
			FileOutputStream fo = new FileOutputStream(flPath);
			wb.write(fo);
			wb.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
