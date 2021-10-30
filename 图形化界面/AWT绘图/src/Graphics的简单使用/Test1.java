package Graphics的简单使用;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test1 {
        //创建主窗口和容器
        Frame frame = new Frame("Graphics简单使用");
        Panel panel1 = new Panel();
        //创建按钮
        Button a = new Button("绘制椭圆");
        Button b = new Button("绘制矩形");
        //设置只读字符串，作用是为了设置不同画笔颜色
        final String RECT = "rect";
        final String OVAL = "oval";
        String judge = "";  //默认颜色为黑色，但是点击按钮时颜色一定会变，所以意义不大（可以看做变色的中转站）
        //创建画布
        class MyCanvas extends Canvas{
            @Override
            public void paint(Graphics g) {
                if(judge.equals(RECT)){
                    g.setColor(Color.RED);
                    g.drawRect(100,100,100,100);
                }
                else if(judge.equals(OVAL)){
                    g.setColor(Color.BLUE);
                    g.drawOval(10,10,100,100);
                }
            }
        }

        MyCanvas my = new MyCanvas();


        //将事件监听器和按钮绑定
        public void init(){
            //将容器布局设置为流式布局
            panel1.setLayout(new FlowLayout());
            //绑定椭圆按钮
            a.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {    //当按下a时，judge设置为静态字符串RECT
                    judge = RECT;
                    my.repaint();   //调用画板重画
                }
            });
            //绑定矩形按钮
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    judge = OVAL;
                    my.repaint();
                }
            });
            //设置窗口关闭按钮
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            //将窗口置于主窗口南部
            frame.add(panel1,BorderLayout.SOUTH);
            //记住还要添加画布
            frame.add(my);
            /*my.setPreferredSize(new Dimension(100,100));*/    //这句话的作用是设置画布大小，没有也可以，就是要自己去拖
            //组装按钮
            panel1.add(a);
            panel1.add(b);

            //设置窗口可见且自动设置大小
            frame.pack();
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            new Test1().init();
    }
}
