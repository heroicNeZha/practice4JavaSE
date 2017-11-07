package IO;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class testIOStream {
	public static void main(String[] args) {
		//Path absolutePath = Paths.get("E:\\Workspace\\Java SE\\Practice4JavaSE\\src\\IO\\lzw.txt");
		Path relativePath = Paths.get("src"+File.separator+"IO"+File.separator+"lzw.txt");


		byte[] buffer = new byte[1024];
		
		try(OutputStream out = Files.newOutputStream(relativePath)){
			out.write("test".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(InputStream in = Files.newInputStream(relativePath)){
			in.read(buffer);
			System.out.println(new String(buffer,StandardCharsets.UTF_8));
		}catch (IOException e) {
			e.printStackTrace();
		}


		
//		try {
//			URL url = new URL("http://www.baidu.com");
//			InputStream in = url.openStream();
//			in.read(buffer);
//            System.out.println(new String(buffer,StandardCharsets.UTF_8));
//		} catch (IOException e) {
//            e.printStackTrace();
//        }
	}
}
