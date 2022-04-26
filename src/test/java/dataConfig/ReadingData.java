package dataConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingData {

	public static void main(String[] args) throws Exception {
		
		
FileInputStream fis = new FileInputStream("./Configfile/configData.properties");

Properties prop = new Properties();

prop.load(fis);

System.out.println(prop.getProperty("appURL"));
System.out.println(prop.getProperty("userName"));
System.out.println(prop.getProperty("password"));

	}

}
