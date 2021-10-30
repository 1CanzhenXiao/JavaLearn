package BoxLayout演示;

import javax.swing.*;
import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayout演示");

        //创建Boxlayout对象
        BoxLayout boxlayout = new BoxLayout(frame,BoxLayout.X_AXIS);
        //将主窗口的布局方式设置为BoxLayout（将Boxlayout对象给主窗口）
        frame.setLayout(boxlayout);
        //添加两个按钮测试
        frame.add(new Button("1"));
        frame.add(new Button("2"));

        frame.pack();
        frame.setVisible(true);
    }
}
