package Writer;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt");
        File f2 = new File("F:/javaIOtest/mkdirsTest/1/2/3/3.txt");

        //输出流也有两种，字符输出和字节输出
        //注意 若该文件不存在，则会自动新建文件，若路径不存在，则会抛出异常

        //用控制台实时写入用户的输入
        Writer w = new FileWriter(f2);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //w.write(bf.readLine());
        //w.close();

        //要想实现一个文件内容复制到另外一个文本文件，就得用输入输出流相互作用
        Reader r = new FileReader(f1);
        char [] temp = new char[(int)f1.length()];
        //直接调用write()函数会覆盖原来内容，若想不覆盖，则用append（像StringBuffer中的append一样）
        r.read(temp);
        r.close();
        w.write(temp);

        w.append(bf.readLine());
        w.close();

    }
}

