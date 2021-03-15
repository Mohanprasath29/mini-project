package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable  {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin.project\\src\\test\\java\\com\\adactin\\properties\\configure.properties");
		
		FileInputStream fiS = new FileInputStream(f); //throws file not found exception
		 p = new Properties();
		 
		 p.load(fiS); // throws io exception
		 
		 //load to add files in properties
		 
		
		 }

	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		return browser;
		
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
    public  String getUsername() {
    	String username = p.getProperty("username");
    	return username;
	}
    public String getPassword() {
    	String password = p.getProperty("password");
    	return password;
    }
    
    
	
	
	
	
	

}
