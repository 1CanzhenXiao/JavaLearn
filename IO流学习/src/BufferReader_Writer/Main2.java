package BufferReader_Writer;

//以下程序为从一个文本读取并写入另外一个文本,并去除文本中的注释

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        File a = new File("F:/javaIOtest/mkdirsTest/1/2/3/4.txt");
        File b = new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt");
        StringBuffer sb = new StringBuffer();
        try(Writer w = new FileWriter(a); Reader r = new FileReader(b);BufferedReader bf = new BufferedReader(r)){
            while(true){
                String line = bf.readLine();
                if(line==null) break;
                if(line.charAt(0)!='/') sb.append(line+"\n");
                else continue;
            }
            w.append(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("程序执行完毕");
        }
    }
}
