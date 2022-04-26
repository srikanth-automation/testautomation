package configReadExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfigdemo {

	Properties prop;

	public Readconfigdemo() throws IOException {

		FileInputStream fis = new FileInputStream("./Configfile/configData.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String launchappurl() {

		String appurl = prop.getProperty("appURL");
		return appurl;
	}

	public String username() {

		String username = prop.getProperty("userName");
		return username;
	}
	
public String password() {
		
String pwd = prop.getProperty("password");
return pwd;
		
	}
}
