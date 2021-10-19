package 对象与类的学习;

import java.util.ArrayList;

//传参练习
public class Hero {
    String name;
    float hp , pp;
    float armor;
    int moveSpeed;
    public Hero(){}
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    //复活方法
    public void revive(Hero h){
        h = new Hero("TM",383);
    }

    public static void main(String[] args) {
        Hero Teemo = new Hero("TM",383);
        Teemo.hp = Teemo.hp-400;
        Teemo.revive(Teemo);
        System.out.println(Teemo.hp);
        //问题：输出多少，怎么理解
    }

    //函数的生命周期有限，作用范围有限，其内部参数并非全局，所以在函数内创建对象是没有作用的
}
