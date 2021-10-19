package compareLearning;

import java.util.Arrays;
import java.util.Comparator;

public class CompareLearn {
    public static void main(String[] args) {
        //compareable抽象类实现与大部分包装类
        String a = "AAAAA";
        int ans = 1;
        //对包装类都生效
        System.out.println(a.compareTo("UHHHAKKJ"));
        System.out.println(new Integer(3).compareTo(4));
        //对基本数据类型不起作用（泛型的定义）
        System.out.print(ans);

        //关于重写sort（使用构造器）
        int [] num = new int [10];
        int [] num2 = new int []{};//创建空数组
        for(int i=0;i<10;i++){
            num[i] = i;
        }
        int num3 [][] = new int [10][1];
        for(int i=0;i<10;i++){
            num3[i][0] = i;
        }

        //对二维数组进行排序（升序），并打印验证
        Arrays.sort(num3, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });
        for(int i=0;i<10;i++){
            System.out.println(num3[i][0]);
        }

        //对一维数组进行排序（若直接对普通数组进行排序则会报错）
        Comparator cmp = new MyComparator();
        //Arrays.sort(num, cmp);
        //需要将普通数组变为包装类数组才可使用比较器（比较器泛型定义不支持基本数据类型）
        Integer num1 [] = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(num1,cmp);
    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1>o2?-1:1;
    }
}
