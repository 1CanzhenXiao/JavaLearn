package Sexp;
import java.io.*;

public class Test2 {
	public static void main(String [] args)throws IOException {
		File a = new File("C:\\Users\\W'd'n'm'd\\Desktop\\《面向对象程序设计》实验指导书 6.doc");
        File b = new File("D:\\2.doc");
        InputStream f1 = new FileInputStream(a);
        OutputStream f2 = new FileOutputStream(b);
        int len;
        while((len = f1.read())!=-1){
            f2.write(len);
        }
        f1.close();
        f2.close();
	}
}
