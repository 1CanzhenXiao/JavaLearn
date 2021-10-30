package Container演示;

import java.awt.*;

public class Test2 {
    public static void main(String[] args) {
        Frame frame = new Frame("测试窗口2");
        Panel panel = new Panel();
        panel.add(new TextField("这是一个文本框textfield"));
        panel.add(new Button("按钮"));
        frame.add(panel);
        frame.setLocation(100,100);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
