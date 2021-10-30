package Dialog对话框学习;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.BoxLayout.*;

public class Test2 {
    public static void main(String[] args) {
        Frame frame = new Frame("模式与非模式对话框的演示");

        //创建一个对话框，一个为模式
        Dialog dialog1 = new Dialog(frame,"模式窗口",true);

        //设置对话框大小
        dialog1.setBounds(100,100,100,100);

        //创建一个按钮，分别控制不同的对话框
        Button button1 = new Button("打开模式对话框");

        //将按钮加入frame
        frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
        frame.add(button1);

        //为模式对话框设定内容
        Box box1 = Box.createVerticalBox();
        TextField textfield = new TextField();
        Button ok = new Button("确认");
        box1.add(textfield);
        box1.add(ok);

        //将box1容器加入模式对话框
        dialog1.add(box1);

        //创建事件监听器
        ActionListener actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog1.setVisible(true);
            }
        };

        /**
         *button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        dialog1.setVisible(true);
        }
        })
         也可在绑定按钮的时候直接新建监听器的作用
         **/

        //将事件监听器与按钮绑定
        button1.addActionListener(actionlistener);

        //设置最佳大小及父窗口可见
        frame.pack();
        frame.setVisible(true);
    }
}