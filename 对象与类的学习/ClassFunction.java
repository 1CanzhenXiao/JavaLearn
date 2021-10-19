package 对象与类的学习;
//静态类方法与对象方法

class D{
    public static void DD(){
        System.out.println("我是其他类下的静态类方法");
    }
}

public class ClassFunction {

    public void A(){
        System.out.println("我是对象方法，不能直接引用");
    }

    public static void B(){
        System.out.println("我是类方法");
    }

    public static void C(){
        //静态类方法不能调用对象方法，静态方法没有对象，而对象方法必须有对象来调用。（也可能为内存区域不同的问题）
        //this.A();
    }

    public static void main(String[] args) {
        D d = new D();
        ClassFunction a = new ClassFunction();
        //静态类方法可在该类中直接调用
        B();
        a.B();
        //不在该类下的静态方法不能直接调用，得通过类名调用
        D.DD();
        //DD();
    }
}
