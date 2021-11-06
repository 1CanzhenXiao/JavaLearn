package FileClass;

import java.io.File;
import java.io.IOException;

/**
 * file class 能对文件和目录进行查找，新建和删除的类，没办法传入文件和修改文件内容
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //file类有三种构造方法，一种是直接传入文件路径，一种是传入父类路径和子文件路径，另外一种是传入一个file对象和子文件路径
        File file = new File("F:/javaIOtest");
        System.out.println(file);

        //创建文件夹有两种方法，mkdir()和mkdirs()
        //mkdir()父文件夹必须存在，mkdirs()若父文件夹不存在则一起创建
        //mkdir()只能创建一级文档，而dirs可以创建多个
        System.out.println(new File("F:/javaIOtest/mkdirTest").mkdir());
        System.out.println(new File("F:/javaIOtest/mkdirsTest/1/2/3").mkdirs());
        System.out.println(new File("F:/javaIOtest/mkdirTest/1/2/3").mkdir()); //此语句无法运行

        File file2 = new File("F:/javaIOtest/mkdirsTest/1/2/3");

        //创建一个新的文本文件
        new File(file2,"2.txt").createNewFile();

        //获取文件信息有get一系列方法
        file2 = new File("F:/javaIOtest/mkdirsTest/1/2/3/2.txt");
        System.out.println(file2.getAbsolutePath()); //绝对路径
        System.out.println(file2.getName()); //最后文件名
        System.out.println(file2.getAbsoluteFile()); //文件绝对路径
        System.out.println(file2.getPath()); //路径
        System.out.println(file2.getParent()); //得到父类路径
        System.out.println();

        //file类的判断功能
        System.out.println(file2.exists());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isAbsolute());
        System.out.println(file2.isHidden());

        //改名
        File f = new File("11.txt");
        System.out.println(file2.renameTo(f));
    }
}
