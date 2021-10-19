package 对象与类的学习;

import java.util.ArrayList;

class Hero1{
    String name;
    public class Head{
        int num;
        void how(){
            System.out.println("WDNMD");
        }
    }
}

public class Inner_Class {
    public static void main(String[] args) {
        Hero1 garen = new Hero1();
        garen.name = "Wa";
        Hero1.Head bbbbb = garen.new Head();
    }
}
