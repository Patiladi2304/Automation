package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/commondataPandey.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty("password");
	String UN = p.getProperty("username");
	String URL = p.getProperty("url");
	System.out.println(value);
	System.out.println(UN);
	System.out.println(URL);
	
	
	
	}

}
