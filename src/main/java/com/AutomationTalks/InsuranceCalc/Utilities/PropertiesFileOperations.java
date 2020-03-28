package com.AutomationTalks.InsuranceCalc.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileOperations {
	
	Properties prop=new Properties();
	
	public String getPropertyValue(String key) throws Exception
	{
		//load the prop file in Java memory
		//load file
		
		File propFile=new File("C:\\Users\\Adapa Teja\\eclipse-workspace\\InsuranceCalc_V2_SDET_Feb2020\\src\\test\\resources\\config.properties");
		FileInputStream fis=new FileInputStream(propFile);
		prop.load(fis);
		
		
		//read prop file
		
		String propVal= prop.getProperty(key);
		return propVal;
		
	}
	
	
	

}
