package Container演示;

import java.awt.*;

public class Test3 {
    public static void main(String[] args) {
        Frame frame = new Frame("测试窗口3");
        /*ScrollPane scrollpane = new ScrollPane ();*/
        ScrollPane scrollpane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);   //若要自己加上滚动条
        scrollpane.add(new TextField("这是一个文本框textfield"));
        scrollpane.add(new Button("按钮"));
        frame.add(scrollpane);
        frame.setBounds(100,100,300,300);
        frame.setVisible(true);
    }
}
