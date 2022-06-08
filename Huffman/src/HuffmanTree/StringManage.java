package HuffmanTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringManage {
    String string;
    Map<Character,Integer> map = new HashMap<>();

    //初始化的同时创建字符字典（map）记录字符出现频率。
    public StringManage(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the String");
        string = s.nextLine();
        int n = string.length();
        for(int i=0;i<n;i++){
            char temp = string.charAt(i);
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
    }
}
