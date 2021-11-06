package BufferReader_Writer;

/**
 * 字符缓冲流可以一次全部读完再写出，节省时间
 * 以下程序演示从文件中读取并输出到终端
 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt");
        try(
                Reader r = new FileReader(f);
                BufferedReader bf = new BufferedReader(r);
                ){
            while(true){
                String line = bf.readLine();
                if(line==null) break;
                else System.out.println(line);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }finally {
            System.out.println("__________________________________________________");
            System.out.println("程序执行完毕。。。。。。。");
        }
    }
}
