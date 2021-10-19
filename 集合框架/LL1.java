package 集合框架;


import java.util.LinkedList;

//双向链表结构Deque
public class LL1 {
    public static void main(String[] args) {
        //双向链表结构有addFirst addLast getFirst getLast removeFirst removeLast
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(1);
        ll1.addLast(2);
        System.out.println(ll1.getFirst());
        System.out.println(ll1.removeFirst());
        System.out.println(ll1);
    }
}
