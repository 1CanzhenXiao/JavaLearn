package 集合框架;
//ArrayList
import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        //方法1，add
        //（1）直接加
        ArrayList al1 = new ArrayList();
        for(int i=0;i<10;i++) al1.add(i);
        System.out.println(al1);
        //在指定位置上添加
        al1.add(2,10000);
        System.out.println(al1);

        //方法2.contains，判断对象是否存在
        System.out.println(al1.contains(10000));
        System.out.println(al1.contains(100));
        System.out.println(al1.contains(al1.get(1)));

        //方法3 get 获取指定下标元素
        System.out.println(al1.get(2));
        //System.out.println(al1.get(100));   //若输入超出有序可重复集合的下标则会报错
        //报错则不会执行下面的语句

        //方法4 indexOf 返回集合元素的下标
        System.out.println(al1.indexOf(10000));

        //方法5 remove 删除某下标元素或对象
        //因为传入集合的都是实际的基本变量，所以没有办法对其进行对象删除
        al1.remove(6);
        System.out.println(al1);

        //方法6 set 替换
        al1.set(0,100000);
        System.out.println(al1);

        //方法7 size 获取集合大小
        System.out.println(al1.size());

        //方法8 addAll 将另一个集合加入进来
        ArrayList al2 = new ArrayList();
        for(int i=200;i<210;i++) al2.add(i);
        al1.addAll(al2);
        System.out.println(al1);

        //方法9 clear 清空
        al2.clear();
        System.out.println(al2);

        //使用泛型，可以使该容器只存放某类型的对象或元素
    }
}
