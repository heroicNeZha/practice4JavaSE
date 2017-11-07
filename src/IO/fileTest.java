package IO;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;

/**
 * Created by Administrator on 2017/11/5.
 */
public class fileTest {

    public static void main(String[] args) {
        File file = new File("src" + File.separator + "IO" + File.separatorChar + "lzw.txt");
        File dir = new File("src" + File.separator + "IO");

        //deleteAllFiles(dir1);
        //showAllFiles(dir1);
        //showJavaFile(dir);
    }

    private static void deleteAllFiles(File dir1) {
        File[] files = dir1.listFiles();
        assert files != null;
        for (File f:files) {
            if(f.isDirectory()){
                deleteAllFiles(f);
            }else{
                System.out.println(f.getName()+":"+f.delete());
            }
        }
    }

    private static void showAllFiles(File dir1) {
        File[] files = dir1.listFiles();
        assert files != null;
        for (File f : files) {
            if (f.isDirectory())
                showAllFiles(f);
            System.out.println(f.getName());
        }
    }

    private static void showJavaFile(File dir) {
        //FileFilter:accept(File file,String name)
        String[] fileNames = dir.list((file1, name1) -> {
            return name1.endsWith(".java");
        });
        assert fileNames != null;
        for (String s : fileNames) {
            System.out.println(s);
        }

        //FileFilter:accept(File file)
        File[] files = dir.listFiles((file1) -> {
            return file1.getName().endsWith(".java");
        });
        assert files != null;
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
