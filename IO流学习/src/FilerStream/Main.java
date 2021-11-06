package FilerStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * InputStream -> FilterInputStream -> DataInputStream
 * 过滤器输入输出流定义了一些可以读取和写指定类型的方法
 */

public class Main {
    public static void main(String[] args) {
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("F:/javaIOtest/mkdirsTest/1/2/3/DataTest.txt"))){
            out.writeBoolean(true);
            out.writeByte(12);
            out.writeBytes("wdnmd");
            out.writeChar('s');
            //写入字符串，每个字符两个字节
            out.writeChars("wdwdwdwdwdwd");
            out.writeUTF("我对你们的哎");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
