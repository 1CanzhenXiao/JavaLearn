package Sexp;
import java.util.*;
import java.io.*;

class MyFilenameFilter implements FilenameFilter{
	public boolean accept(File dir,String name) {
		if(dir.exists())
			return true;
		else return false;
	}
}

public class Test3 {
	public static void main(String [] args) {
		File file = new File("D:\\java");
		MyFilenameFilter my = new MyFilenameFilter();
		
		String[] a = file.list(my);
		File[] b = file.listFiles(my);
		
		for(String a1:a) {
			System.out.println(a1);
		}
		
		System.out.println("----------------------------------------------");
		
		for(File b1:b) {
			System.out.println(b1);
		}
	}
}
