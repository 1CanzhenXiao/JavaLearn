package BinaryIO_Class;

import java.io.*;

/**
 *  文本类的输入输出流为Scanner & PrintWriter
 *  二进制输入输出流为InputStream & OutputStream 其下子类有FileInputStream/OutputStream
 *  还有过滤类基类FilterInputStream/OutputStream 及其子类 DateInputStream/OutputStream
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //其实本节没有新内容，都与字符输入输出差不多
        //唯一重要的一点就是字节流的输入输出不用解码转码，用来读取与改写一些二进制文件比较快捷
        //二进制输入输出流可在外部封装文本输入输出流
        FileOutputStream out = new FileOutputStream("F:/javaIOtest/mkdirsTest/1/2/3/5.txt");
        File file1 = new File("F:/javaIOtest/mkdirsTest/1/2/3/5.txt");
        File file2 = new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt");
        FileInputStream input = new FileInputStream(file2);
        PrintWriter pw = new PrintWriter(out);
        pw.close();
    }
}
