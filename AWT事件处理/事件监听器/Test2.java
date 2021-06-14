package 事件监听器;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    Frame frame = new Frame("事件监听器的使用");

    //新建按钮和文本条
    Button ok = new Button("确认");
    TextField text = new TextField();

    //组装部件
    public void init(){
        frame.add(text,BorderLayout.NORTH);
        frame.add(ok);
        //将事件监听器与按钮绑定
        ok.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("Hello World!!! WDNMD");
            }
        });
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Test2().init();
    }
}
