package Exp1;
import java.io.*;
import java.util.*;

public class Text1 {
    public static void main(String[] args)throws IOException {
       /* File a = new File("D:\\2.txt");
        byte [] bytes = new byte[512];
        FileInputStream fis = new FileInputStream(a);
        int rs = 0;
        System.out.println("The is :");
        while((rs = fis.read(bytes,0,512))>0){
            System.out.println(rs);
            String s = new String(bytes,0,rs);
            System.out.println(s);
        }
        System.out.println(rs);
        fis.close();
        FileWriter writer = new FileWriter(a);
        writer.write("WDNMD");  //被覆盖了
        writer.flush();
        writer.close();*/

        /*File a = new File("D:\\1.txt");
        a.createNewFile();
        File b = new File("D:\\2.txt");
        FileReader f2 = new FileReader(b);
        FileWriter f1 = new FileWriter(a);
        char [] chars = new char[512];
        int num = 0;
        num = f2.read(chars,0,512);
        f2.close();

        f1.write(chars, 0,num);
        f1.close();*/

        File a = new File("C:\\Users\\W'd'n'm'd\\Desktop\\《面向对象程序设计》实验指导书 6.doc");
        File b = new File("D:\\2.doc");
        InputStream f1 = new FileInputStream(a);
        OutputStream f2 = new FileOutputStream(b);
        int len;
        while((len = f1.read())!=-1){
            f2.write(len);
        }
        f1.close();
        f2.close();
        System.out.println(len);
    }

}
