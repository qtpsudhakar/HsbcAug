package com.files.handle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData_txt {

	public static void main(String[] args) {
		
		String flPath = "C:\\Users\\envy\\Desktop\\HSBC_Aug\\Demo1.txt";
		try {
			FileWriter fw = new FileWriter(flPath,true); //true will append data
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("line1");
			bw.newLine();
			bw.write("line2");
			bw.newLine();
			bw.write("line3");
			bw.newLine();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
