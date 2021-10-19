package 集合框架;

import java.util.HashMap;
import java.util.Map;

//单链表
public class LL3 {
    public static void main(String[] args) {
//        ListNote a = new ListNote(1);
//        a = new ListNote();
//        System.out.println(a);
//        int num=100;
//        for(int i=0;i<num;i++){
//            System.out.println(i);
//            if(i==10){
//                i=90;
//                num=120;
//            }
//        }
//        int a=1;
//        boolean b = false;
//        a += b ? 1 : -1;
//        System.out.println(a);
        String a = "abc";
        System.out.println(a.charAt(2));
        Map<Character,Character> map = new HashMap<>();
        map.put('a','c');
        map.put('a','d');
        System.out.println(map.get('a'));
        System.out.println(map.get('a'));
    }
}

class ListNote{
    int val;
    ListNote next;
    ListNote(){};
    ListNote(int val){
        this.val = val;
    }
    ListNote(int val,ListNote next){
        this.val = val;
        this.next = next;
    }
}
