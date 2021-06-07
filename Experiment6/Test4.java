package Sexp;
import java.io.*;

public class Test4 {
	public static void main(String [] args)throws IOException {
		File a = new File("D:\\1.txt");
        System.out.println(a.createNewFile());
        a.delete();
        
        File b = new File("D:\\abc");
        System.out.println(b.mkdir());
        b.delete();
        
        File c = File.createTempFile("lzq", ".tmp", new File("D:\\"));
        c.delete();
	}
}
