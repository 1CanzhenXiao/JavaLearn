package BufferReader_Writer;

import java.io.*;

/**
 * 以下程序为缓存输出流
 * 一次写出一行语句
 */

public class Main1 {
    public static void main(String[] args) {
        File f = new File("F:/javaIOtest/mkdirsTest/1/2/3/4.txt");
        try (Writer w = new FileWriter(f);
             PrintWriter p = new PrintWriter(w)){
             p.println("写文件，一行一行");
             //若要将数据立即写入文件得用flush
             p.flush();
             p.println("wdnmd");
             p.println("wdnmd");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("程序执行完毕");
        }
    }
}
