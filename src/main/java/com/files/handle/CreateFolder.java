package com.files.handle;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		String fldPath = "C:\\Users\\envy\\Desktop\\HSBC_Aug\\d1\\d2\\d3";

		new File(fldPath).mkdirs();
	}

}
