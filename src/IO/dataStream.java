package IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
public class dataStream {
    public static void main(String[] args) {
        dataStream data = new dataStream();
        data.readFile("D:\\Workspace\\IntelliJ IDEA\\practice4JavaSE\\src\\IO\\b3_data.dat");
    }

    public void doit() {
        try {
            Path path = Paths.get("D:\\Workspace\\IntelliJ IDEA\\practice4JavaSE\\src\\IO\\b3_data.dat");
            List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists() || file.isDirectory())
                throw new FileNotFoundException();
            BufferedReader br = null;
            br = new BufferedReader(new FileReader(file));
            String temp = null;
            temp = br.readLine();
            while (temp != null) {
                System.out.println(temp);
                temp = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
