package BoxLayout演示;

import javax.swing.*;
import java.awt.*;

public class Test3 {
    public static void main(String[] args) {    //添加间隔
        Frame frame = new Frame("BoxLayout展示");

        //创建swing包中Box的方法构建的容器
        Box b1 = Box.createHorizontalBox();
        b1.add(new Button("11"));
        b1.add(Box.createHorizontalGlue());
        b1.add(new Button("12"));
        b1.add(Box.createHorizontalStrut(10));
        b1.add(new Button("13"));

        Box b2 = Box.createVerticalBox();
        b2.add(new Button("23"));
        b2.add(Box.createVerticalGlue());
        b2.add(new Button("24"));
        b2.add(Box.createVerticalStrut(10));
        b2.add(new Button("25"));

        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2);

        frame.pack();
        frame.setVisible(true);
    }
}
