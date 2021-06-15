package Sexp;
import java.util.*;
import java.io.*;

class ReadFile{	
    public void ReadChar(File file)throws IOException{  //单个字符读取
        FileReader filereader = new FileReader(file);
        int len;
        while((len = filereader.read())!=-1) {
        	System.out.print((char)len);
        }
        filereader.close();
        System.out.println();
    }
    
    
    public void ReadByte(File file)throws IOException{	 //单字节读取
    	FileInputStream fileinputstream = new FileInputStream (file);
    	int len;
    	while((len = fileinputstream.read())!=-1) {
    		System.out.print((char)len);
    	}
    	fileinputstream.close();
    	System.out.println();
    }
    
    public void ReadLine(File file)throws IOException{	//按行读取
    	BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
    	String a;
    	while((a = bufferedreader.readLine())!=null) {
    		System.out.println(a);
    	}
    	bufferedreader.close();
    }
}


public class Test5 {
    public static void main(String[] args)throws IOException {
        File file = new File("D:\\1.txt");
        ReadFile a = new ReadFile();
        a.ReadChar(file);
   
        System.out.println("--------------------------------");
        a.ReadByte(file);
        
        System.out.println("--------------------------------");
        a.ReadLine(file);
    }
}
