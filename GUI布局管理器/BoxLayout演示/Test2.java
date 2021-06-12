package BoxLayout演示;

import javax.swing.*;
import java.awt.*;

public class Test2 {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayout展示");

        //创建swing包中Box的方法构建的容器
        Box b1 = Box.createHorizontalBox();
        b1.add(new Button("1"));
        b1.add(new Button("2"));

        Box b2 = Box.createVerticalBox();
        b2.add(new Button("3"));
        b2.add(new Button("4"));

        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2);

        frame.pack();
        frame.setVisible(true);
    }
}
