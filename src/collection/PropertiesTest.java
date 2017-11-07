package collection;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		//–¥»Î Ù–‘
		String path = "E:\\Workspace\\Java SE\\Practice4JavaSE\\src\\collection\\settings.txt";
		Properties settings = new Properties();
		settings.put("width", "200");
		settings.put("title", "Hello,World");
		try(OutputStream out = Files.newOutputStream(Paths.get(path))){
			settings.store(out, "settings");
		}catch (IOException e) {
			e.printStackTrace();
		}
		//∂¡»°
		//String path = "E:\\Workspace\\Java SE\\Practice4JavaSE\\src\\collection\\settings.txt";
		Properties readers = new Properties();
		try(InputStream in = Files.newInputStream(Paths.get(path))){
			readers.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("the width of "+readers.getProperty("title")+
				" is "+readers.getProperty("width"));
	}

}
