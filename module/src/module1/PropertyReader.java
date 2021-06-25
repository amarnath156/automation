package module1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public static String applicationConfigReader(String key) throws IOException
	//public void fetchpropertydata() throws IOException
	{
		Properties prop = new Properties();
		File f = new File("./ConfigFiles/application.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
	//System.out.println(prop.get("Application_URL"));
	return prop.get(key).toString();
	}

}
