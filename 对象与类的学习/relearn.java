package 对象与类的学习;

import java.util.Arrays;

class NumberArrays{
    //创建数组
    //该代码的左端为变量声明,意为创建数组变量，其中【】代表该变量为数组（也叫声明引用）
    //右端为创建数组（注意指针和引用的区别）
    int [] num = new int [10];
    int [] a = num;
    int [] c = a;
    //该数组有三个名称a,c,num,对其的修改即为都相同；
    //上面三条代码即为引用，引用和指针的效果相同，故java中没有指针
    //引用即为变量起别名，基本数据类型不存在引用这一说法
}

public class relearn {
    public static void main(String[] args) {
        NumberArrays a = new NumberArrays();
        a.num[0] = 1;
        a.a[0] = 10;
        a.c[1] = 1000;
        System.out.println(a.num[0]+", "+a.num[1]);
        System.out.println(a.a[0]);
        System.out.println(a.c[0]);

        //数组复制——arraycopy用法
        int aa [] = new int []{1,2,13,13,131,31,13,13,3,13};
        int bb [] = new int [7];
        System.arraycopy(aa,2,bb,0,7);
        for(int cc:bb) System.out.println(cc);

        //数组复制————Arrays类下的copyOfRange(幅度复制)
        int [] cc = Arrays.copyOfRange(aa,0,10);
        for(int dd:cc) System.out.println(dd);
    }
}
