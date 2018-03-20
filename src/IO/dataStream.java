package IO;

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
        data.doit();
    }

    public void doit() {
        try {
            Path path = Paths.get("D:\\Workspace\\IntelliJ IDEA\\practice4JavaSE\\src\\IO\\b3_data.dat");
            List<String> lines = Files.readAllLines(path,Charset.defaultCharset());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
