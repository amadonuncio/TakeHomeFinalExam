package practicalQuestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Practical2 {

	public static void main(String[] args) throws IOException {
		String propertiesPath = "Dictionary\\Definitions.properties";
		String path = "Dictionary\\Definitions.txt";
		doesTextFileExist(path);
		System.out.println("-----------");
		doesPropertiesFileExist(propertiesPath);
	}

	public static void doesTextFileExist(String path) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);
		try (BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line=br.readLine())!= null) {
				System.out.println(line);
			}
		}
	}
	
	public static void doesPropertiesFileExist(String path) throws IOException {
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(path);
		prop.load(fi);
		Object[] keys = prop.keySet().toArray();
		System.out.println(keys[2]);
		System.out.println(prop.get("Apple"));
		System.out.println(keys[0]);
		System.out.println(prop.get("Table"));
		System.out.println(keys[1]);
		System.out.println(prop.get("Orange"));
	}

}
