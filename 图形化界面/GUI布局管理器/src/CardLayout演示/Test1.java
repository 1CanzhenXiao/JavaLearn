package CardLayout演示;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("cardLayout演示");
        //新建一个panel，放置在窗口的上部
        Panel panel1 = new Panel();
        //新建一个cardLayout布局对象，方便下面应用其方法
        CardLayout cardlayout = new CardLayout();
        //将内部件的布局格式设置为CardLayout型
        panel1.setLayout(cardlayout);
        //创建名称数组，方便后续为组件起名和调用方法
        String[] name = {"第一张","第二张","第三张","第四张","第五张","第六张"};
        //往内部件中加入五个小组件按钮
        for(int i=0;i< name.length;i++){
            panel1.add(name[i],new Button(name[i]));
        }
        //将小窗口放置在主窗口中
        frame.add(panel1);

        //新建一个小窗口panel2;
        Panel panel2 = new Panel();
        //创建五个按钮组件
        Button b1 = new Button("第一张");
        Button b2 = new Button("最后一张");
        Button b3 = new Button("下一张");
        Button b4 = new Button("上一张");
        Button b5 = new Button("第三张");
        //往窗口中加入五个按钮
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        //创建事件监听器并重写事件捕捉方法的代码
        ActionListener actionlistener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                switch (s){
                    case"第一张" :
                        /*new CardLayout().first(panel1);*/
                        cardlayout.first(panel1);
                        break;
                    case"最后一张" :
                        cardlayout.last(panel1);
                        break;
                    case"下一张" :
                        cardlayout.next(panel1);
                        break;
                    case"上一张" :
                        cardlayout.previous(panel1);
                        break;
                    case"第三张" :
                        cardlayout.show(panel1,"第三张");
                        break;
                }
            }
        };
        //将panel2的五个按钮与事件监听器绑定
        b1.addActionListener(actionlistener);
        b2.addActionListener(actionlistener);
        b3.addActionListener(actionlistener);
        b4.addActionListener(actionlistener);
        b5.addActionListener(actionlistener);
        //将小窗口加入到主窗口的南部
        frame.add(panel2,BorderLayout.SOUTH);

        //自动设置布局和设置窗口可见
        frame.pack();
        frame.setVisible(true);
    }
}
