package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {
	static Properties props = new Properties();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		writeProperties();
		getProperties();

	}
	
	public static void getProperties() {
		//Properties props = new Properties();
		try {
			InputStream input = new FileInputStream("F:\\Phani Work\\StepbyStepDemo\\SeleniumFramework\\src\\test\\java\\config\\config.properties");
		    props.load(input);
		    String key = props.getProperty("browser");
		    TestNG_Demo.browserName = key;
		    System.out.println("Value "+key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  static void writeProperties() {
		
		try {
			OutputStream outPut = new FileOutputStream("F:\\Phani Work\\StepbyStepDemo\\SeleniumFramework\\src\\test\\java\\config\\config.properties");
		    props.setProperty("browser", "chrome");
		    props.store(outPut, "");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
