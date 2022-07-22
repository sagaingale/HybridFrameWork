package com.utility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


// This class is used to read property files, 

public class PropertiesUtils {
	
	public static File file;
	public static FileInputStream fis;
	public static Properties pro;
	
	
	
	
	public static String readProperty(String key) throws Exception {
		
		String propertyPath=".\\src\\main\\resources\\config.properties";      // Path of Property file 
		 file = new File(propertyPath);   
	
		 fis = new FileInputStream(file);
		 
		 pro = new Properties();
		 pro.load(fis);
		 
		return pro.getProperty(key);
	}
	
//	public static void readProperties() throws Exception {
//		
//		String firstName = readProperty("firstName");
//		
//		
//	}
//	public static void main(String[] args) throws Exception {
//		readProperties();
//	}

}
