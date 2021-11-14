package ObjectStream;

import java.io.*;

//要将对象序列化必须实现serializable接口
class test implements Serializable{
    String name = "WDNMD";
}

public class Main {
    public static void main(String[] args) {
        File f = new File("F:/javaIOtest/ObjectStream/test.tt");    //文件名后缀由自己命名
        try( FileOutputStream fo = new FileOutputStream(f);ObjectOutput oo = new ObjectOutputStream(fo);
             FileInputStream fi = new FileInputStream(f);ObjectInput oi = new ObjectInputStream(fi); ){
            oo.writeObject(new test());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
