package IO;

import sun.swing.SwingUtilities2;

import java.io.*;
/**
 * Created by Administrator on 2017/11/5.
 */
public class byteStream {
    //适配全平台换行符
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static final int MAX_BUFFER_LENGTH = 1024;

    public static void main(String[] args){
        File file = new File("src" + File.separator + "IO" + File.separatorChar + "lzw.txt");
        byte[] OutBuffer = "test".getBytes();
        byte[] InBuffer = new byte[MAX_BUFFER_LENGTH];
        //断言文件所在目录一定存在
        assert file.getParentFile().exists();
        writeFile(file,(LINE_SEPARATOR+"enterTest").getBytes());
        readFile(file, InBuffer);
    }

    private static void writeFile(File file,byte[] OutBuffer) {
        //写操作
        try(FileOutputStream fileOutputStream = new FileOutputStream(file,true)){

            fileOutputStream.write(OutBuffer);
            System.out.println("#write buffer success");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(File file, byte[] inBuffer) {
        //读操作
        try(FileInputStream fileInputStream = new FileInputStream(file)){

            while(fileInputStream.read(inBuffer)>0) {
                System.out.println(new String(inBuffer));
            }
            System.out.println("#read buffer success");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
