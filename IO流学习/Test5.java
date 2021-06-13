import java.util.*;
import java.io.*;

class ReadFile{
    public void ReadChar(File file)throws IOException{
        FileReader filereader = new FileReader(file);
        int len;
        while((len = filereader.read())!=-1){
            System.out.print((char)len);
        }
        filereader.close();
    }

    public void ReadCharArray(File file)throws IOException{
        FileReader filereader = new FileReader(file);
        char[] len = new char[(int)file.length()];
        filereader.read(len);
        for(char a : len){
            System.out.print(a);
        }
        filereader.close();
    }
}

public class Test5 {
    public static void main(String[] args)throws IOException {
        File file = new File("D:\\1.txt");
        ReadFile a = new ReadFile();
        a.ReadChar(file);
        System.out.println();
        System.out.println("------------------------");
        a.ReadCharArray(file);
    }
}
