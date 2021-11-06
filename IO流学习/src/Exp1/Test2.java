package Exp1;
import java.io.*;

class CopyFile{
    public static void copyFile(File file1,File file2) throws IOException {
        if(file1.isFile()) {
            FileInputStream i = null;
            FileOutputStream o = null;
            try {
                String name = (file2.getAbsolutePath().endsWith("\\") ?
                        file2.getAbsolutePath() + file1.getAbsolutePath().substring(3) : file2.getAbsolutePath() +
                        "\\" + file1.getAbsolutePath().substring(3));
                i = new FileInputStream(file1);
                o = new FileOutputStream(name);
                int len;
                while ((len = i.read()) != -1) {
                    o.write(len);
                }

            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (NullPointerException e2){
                e2.printStackTrace();
            } finally {
                i.close();
                o.close();
                return;
            }

        }

        File []a = file1.listFiles();
        for(File b:a){
            if(b.isDirectory()) {
                String name = (file2.getAbsolutePath().endsWith("\\") ?
                        file2.getAbsolutePath() + file1.getAbsolutePath().substring(3) : file2.getAbsolutePath() + "\\" + file1.getAbsolutePath().substring(3));
                File file3 = new File(name);
                file3.mkdirs();
            }
            if(file2.exists())  copyFile(b, file2);
        }
    }
}

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\JAVA\\Work space");
        File file2 = new File("D:\\Test");
        CopyFile copyfile = new CopyFile();
        copyfile.copyFile(file1,file2);
    }
}

