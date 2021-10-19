package 对象与类的学习;
//单例模式(即不能被外部随便实例化，由系统定义)

//饿汉式
class A{
    private A(){ }
    private static A a = new A();
    public static A aa(){
        return a;
    }
}

//懒汉式
class B{
    private B(){}
    private static B b;
    public static B bb(){
        if(b==null){
            b = new B();
        }
        return b;
    }

}

public class Singleton_Pattern {
    public static void main(String[] args) {
        A.aa();
    }
}
