package 访问修饰控制符;
import 对象与类的学习.*;
/*
    default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
    private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
    public : 对所有类可见。使用对象：类、接口、变量、方法
    protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
*/
class A{
    //私有private，只能在该类中才能访问，其他类不能直接访问，为的是保护数据和隐藏类的实现细节
    private int a = 0;
    //当变量被私有时，应设置方法给外部类访问和操作变量值
    void aa(int x){ //setting
        this.a = x;
    }
    int aab(){  //getting
        return this.a;
    }
}

public class test {
    public static void main(String[] args) {
        A aaa = new A();
        aaa.aa(22);
        System.out.println(aaa.aab());
        Hero aaaaa = new Hero(); //该类取自其他包
    }
}
