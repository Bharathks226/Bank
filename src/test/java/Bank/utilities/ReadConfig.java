package Bank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		
		File src = new File ("./Configurations/config.properties");
		
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationURL()
	{
	
		String url= pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
	
		String username= pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
	
		String password= pro.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	{
	
		String chromepath= pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath()
	{
	
		String firefoxpath= pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	}


