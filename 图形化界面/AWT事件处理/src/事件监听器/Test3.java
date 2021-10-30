package 事件监听器;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 通过ContainerListener向Frame容器添加组件
 * 通过TextListener监听TextField中文本的变化
 * 通过ItemListener监听Choice组件条目的变化
 * */

public class Test3 {
    public static void main(String[] args) {
        Frame frame = new Frame("事件监听器的使用");
        Choice choice = new Choice();
        choice.add("A");
        choice.add("B");
        choice.add("C");
        TextField textfield = new TextField();
        Box box1 = Box.createHorizontalBox();
        box1.add(choice);
        box1.add(textfield);
        frame.add(box1);

        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object item1 = e.getItem();
                System.out.println(item1);
            }
        });

        textfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                System.out.println("输入的内容为： "+s);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
