package com.wd.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

	public static String getUniqueID(){
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddhhmmss");
		return sd.format(new Date());

	}

}
