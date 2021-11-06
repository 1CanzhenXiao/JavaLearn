package Reader;
import java.io.*;

/**
 * Reader为InputStreamReader的父类，InputStreamReader为FileReader的父类
 * Writer亦是如此
 */

public class Main {
    public static void main(String[] args) throws IOException {
        if(!new File("F:/javaIOtest/mkdirsTest/1/2/3/1.txt").exists())
            new File("F:/javaIOtest/mkdirsTest/1/2/3/1.txt").createNewFile();
        if(!new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt").exists())
            new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt").createNewFile();

        //输入流分为字符输入和字节输入
        InputStream isr = new FileInputStream(new File("F:/javaIOtest/mkdirsTest/1/2/3/1.txt"));
        Reader fr = new FileReader(new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt"));

        //读取字符
        byte [] temp = new byte [(int)new File("F:/javaIOtest/mkdirsTest/1/2/3/1.txt").length()];
        char [] temp1 = new char [(int)new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt").length()];
        isr.read(temp);
        fr.read(temp1);
        for(byte a:temp) System.out.print((char)a);
        System.out.println();
        for(char a:temp1) System.out.print(a);
        isr.close();
        fr.close();     //关闭字节流
    }
}
