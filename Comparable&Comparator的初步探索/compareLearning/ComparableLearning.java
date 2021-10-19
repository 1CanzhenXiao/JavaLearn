package compareLearning;

import java.util.Arrays;

//类在没有实现comparable接口时不能是使用Arrays.sort方法
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;
    public Student(String name,int age,double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String toString(){
        System.out.print("默认调用toString（）");
        return name+"  "+age+"  "+score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score>o.score) return -1;
        else{
            if(this.age>o.age) return -1;
            else return 1;
        }
    }
}

public class ComparableLearning {
    public static void main(String[] args) {
        Student [] stu = new Student[]{
            new Student("AAA",20,90.2),
            new Student("BBB",42,51),
            new Student("CCC",1,200),
        };
//        前面有修饰词私有private时，该变量只能在那个类中使用
//        Student n = new Student("AAAAA",20,10);
//        int age = n.age;
//
        Arrays.sort(stu);

        //for(Student a:stu){
        //    System.out.println(a.toString());
        //}
        //在输出时会默认调用toString（）方法
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i]);
        }
    }
}
