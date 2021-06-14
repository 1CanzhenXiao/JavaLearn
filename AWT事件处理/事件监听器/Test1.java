package 事件监听器;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("事件监听器");
        //创建一个按钮
        Button button = new Button("WDNMD");
        //将按钮添加到窗口
        frame.add(button);
        //创建一个事件监听器,由于事件监听是一个抽象类，所以需要实现接口中的所有方法才能创建对象
        ActionListener a = new ActionListener() {
            @Override

            /*按理解，ActionEvent e应该就是你在执行点击按钮时储存该动作的一个对象。
            当e发生时，会执行actionPerformed方法中的代码*/

            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                System.out.println(s);
            }
        };

        //将事件监听器与按钮绑定
        button.addActionListener(a);

        frame.pack();
        frame.setVisible(true);
    }
}
