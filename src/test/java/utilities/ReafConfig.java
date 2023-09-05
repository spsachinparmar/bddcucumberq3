package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReafConfig {

	
 Properties properties;
 
 String Path ="config.properties";
 
 public ReafConfig() throws Exception {
	 
	 properties=new Properties();
	 
	 FileInputStream fis=new FileInputStream(Path);
	 
	 properties.load(fis);
	 
 }
 public  String getBrowser() {
	 
	 String Value=properties.getProperty("browser");
	 
	 return Value;
	 
 }
	
	
}
