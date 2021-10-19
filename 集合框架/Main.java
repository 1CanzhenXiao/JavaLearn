package 集合框架;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String [] a = bf.readLine().split("\\s");
        int [] aa = new int [5];
        int n = a.length;
        for(String a1:a){
            int a11 = Integer.valueOf(a1);
            if(a11%5==a11%2) aa[0]+=a11;
        }
        int index = 1;
        for(String a1:a){
            int a11 = Integer.valueOf(a1);
            if(a11%5==1) {
                aa[1] += index * a11;
                index *= index;
            }
        }
        for(String a1:a){
            int a11 = Integer.valueOf(a1);
            if(a11%5==2) aa[2]++;
        }
        int num = 0;
        for(String a1:a){
            int a11 = Integer.valueOf(a1);
            if(a11%5==3){
                aa[3]+=a11;
                num++;
            }
        }
        aa[3]/=num;
        for(String a1:a){
            int a11 = Integer.valueOf(a1);
            if(a11%5==4) aa[4] = Math.max(aa[4],a11);
        }
        for(int i=0;i<5;i++){
            if(aa[i]!=0) System.out.print(aa[i]+" ");
            else if(aa[i]==0) System.out.print("N"+" ");
            else if(i==4) System.out.print(aa[i]);
        }
    }
}
