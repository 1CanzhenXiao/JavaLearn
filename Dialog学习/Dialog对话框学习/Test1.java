package Dialog对话框学习;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.BoxLayout.*;

public class Test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("模式与非模式对话框的演示");

        //创建两个对话框，一个为模式，一个非模式
        Dialog dialog1 = new Dialog(frame,"模式窗口",true);
        Dialog dialog2 = new Dialog(frame,"非模式窗口",false);

        //设置对话框大小
        dialog1.setBounds(100,100,100,100);
        dialog2.setBounds(100,100,100,100);

        //创建两个按钮，分别控制不同的对话框
        Button button1 = new Button("打开非模式对话框");
        Button button2 = new Button("打开模式对话框");

        //将两个按钮加入frame
        frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
        frame.add(button1);
        frame.add(button2);

        //创建事件监听器
        ActionListener actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="打开非模式对话框") dialog1.setVisible(true);
                else dialog2.setVisible(true);
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
        button2.addActionListener(actionlistener);

        //设置最佳大小及父窗口可见
        frame.pack();
        frame.setVisible(true);
    }
}
