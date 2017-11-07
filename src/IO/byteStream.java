package IO;

import sun.swing.SwingUtilities2;

import java.io.*;

/**
 * Created by Administrator on 2017/11/5.
 */
public class byteStream {
    public static void main(String[] args){
        final int MAX_BUFFER_LENGTH = 1024;
        File file = new File("src" + File.separator + "IO" + File.separatorChar + "lzw.txt");
        byte[] OutBuffer = "test".getBytes();
        byte[] InBuffer = new byte[MAX_BUFFER_LENGTH];
        assert file.getParentFile().exists();

        try(FileOutputStream fileOutputStream = new FileOutputStream(file,true)){
            fileOutputStream.write(OutBuffer);
            System.out.println("write buffer success");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fileInputStream = new FileInputStream(file)){
            while(fileInputStream.read(InBuffer)>0) {
                System.out.println(new String(InBuffer));
            }
            System.out.println("read buffer success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
