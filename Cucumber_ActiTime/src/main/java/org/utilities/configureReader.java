	package org.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configureReader {
//public String getConfigDataActi(String key) throws IOException {
//	try {
//		FileInputStream fis=new FileInputStream("A:cmd prg//Cucumber_ActiTime//properties//ConfigForActiTime.properties");
//	Properties prop=new Properties();
//	prop.load(fis);
//	return prop.getProperty(key);
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//		return null;
//	}
//}
public Properties init_prop() throws IOException {//returns object 
	FileInputStream fis;
	try {
		fis = new FileInputStream("A://cmd prg//Cucumber_ActiTime//src//test//resources//config//ConfigForActiTime.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		return null;
	}
	
	
}
}
