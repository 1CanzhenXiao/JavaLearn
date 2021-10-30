package PopupMenu演示;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 {
    public static void main(String[] args) {
        //新建一个窗口frame
        Frame frame = new Frame("华氏与摄氏换算");
        //新建两个按钮
        Button button1 = new Button("华氏");
        Button button2 = new Button("摄氏");
        //创建两个容器
        Box box1 = Box.createVerticalBox();
        Box box2 = Box.createVerticalBox();
        //创建标签和文本域
        TextArea textarea1,textarea2;
        Label label1,label2;
        textarea1 = new TextArea();
        textarea2 = new TextArea();
        label1 = new Label("摄氏温度：");
        label2 = new Label("华氏温度：");
        //初始化
        class Init{
            void init(){
                //组装
                box1.add(label1,BorderLayout.NORTH);
                box2.add(label2,BorderLayout.NORTH);
                box1.add(textarea1);
                box2.add(textarea2);
                box1.add(button1,BorderLayout.SOUTH);
                box2.add(button2,BorderLayout.SOUTH);
                frame.setLayout(new BoxLayout(frame,BoxLayout.X_AXIS));
                frame.add(box1);
                frame.add(box2);

                //将事件监听器与按钮绑定
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String C = textarea1.getText();
                        float c = Float.parseFloat(C);
                        textarea2.setText("华氏度为："+(float)((c*1.8)+32)+"\n"+"输入前请清空文本域");
                    }
                });

                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String F = textarea2.getText();
                        float f = Float.parseFloat(F);
                        textarea1.setText("摄氏度为："+(float)((f-32)/1.8)+"\n"+"输入前请清空文本域");
                    }
                });

                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
                //设置窗口可见和最佳大小
                frame.pack();
                frame.setVisible(true);
            }
        }

        new Init().init();

    }
}
