package BorderLayout演示;

import java.awt.*;

public class Text1 {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout演示");
        frame.setLayout(new BorderLayout(100,100));
        Panel panel = new Panel();
        panel.add(new TextField("测试文本框"));
        panel.add(new Button("文本框按钮"));
        //为框式布局添加按钮
        frame.add(new Button("NORTH"),BorderLayout.NORTH);
        frame.add(new Button("SOUTH"),BorderLayout.SOUTH);
        frame.add(new Button("WEST"),BorderLayout.WEST);
        frame.add(new Button("EAST"),BorderLayout.EAST);
        frame.add(new Button("CENTER"),BorderLayout.CENTER);
        //将小窗口添加到主窗口中
        frame.add(panel);


        frame.pack();
        frame.setVisible(true);
    }
}
