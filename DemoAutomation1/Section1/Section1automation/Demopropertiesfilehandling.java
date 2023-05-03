package Section1automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demopropertiesfilehandling {
	public static void main(String[] args) throws IOException {
		FileInputStream Fis = new FileInputStream("D:\\data\\Sdtd Automation\\Data storage\\VtigerData.properties");
		Properties prop = new Properties();
		prop.load(Fis);
		String url = prop.getProperty("Url");
		String un = prop.getProperty("username");
		String pwd = prop.getProperty("passward");
		System.out.println(url+"\n"+un+"\n"+pwd);
		
		
	}

}
