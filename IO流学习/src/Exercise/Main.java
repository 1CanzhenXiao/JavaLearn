package Exercise;
import java.io.*;

/**
 * 本节实现的三个函数。
 * 作用分别是实现文件的复制。
 * 文件夹的复制。
 * 查询包含某字段文件并打印其路径。
 */

public class Main {
    public static void main(String[] args) {
        //先初始化练习文件及文件夹
        File f = new File("F:\\javaIOtest\\Exercises\\e1\\e2\\e3\\e4");
        f.mkdirs();
        File e1 = new File("F:\\javaIOtest\\Exercises\\e1\\e1.txt");
        File e2 = new File("F:\\javaIOtest\\Exercises\\e1\\e2\\e2.txt");
        File e3 = new File("F:\\javaIOtest\\Exercises\\e1\\e2\\e3\\e3.txt");
        File e4 = new File("F:\\javaIOtest\\Exercises\\e1\\e2\\e3\\e4\\e4.txt");
        try(FileWriter fw = new FileWriter(e1);
        BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("这是测试文件\n");
            bw.append("我不知道为什么之前一直创建不了，代码都一样啊，很邪门\n");
            bw.append("2021-11-14-16:00");
        } catch (IOException e) {
            e.printStackTrace();
        }

        copy(e1,e2);
    }

    public static void copy(File source, File destination){
        try(FileReader fr = new FileReader(source);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(destination);
        BufferedWriter bw = new BufferedWriter(fw)){
            while(true) {
                String s = br.readLine();
                if (s == null) break;
                else bw.append(s+"\n");
            }
            bw.append("（此为复制文件）");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("复制完毕");
        }
    }
}


