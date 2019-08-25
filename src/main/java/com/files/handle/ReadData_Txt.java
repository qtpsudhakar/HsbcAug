package com.files.handle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Txt {

	public static void main(String[] args) {

		String flPath = "C:\\Users\\envy\\Desktop\\HSBC_Aug\\Demo.txt";
		try {
			FileReader fr = new FileReader(flPath);
			BufferedReader br = new BufferedReader(fr);

			String lnData = br.readLine() ;
			while (lnData != null) {
				System.out.println(lnData);
				lnData = br.readLine() ;
			}
			br.close();
			fr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
