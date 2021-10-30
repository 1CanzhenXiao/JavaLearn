package Awt常用组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT组件测试");
        //将组件写好
        List colorlist = new List(6,true);  //六行，多选

        TextField textfield = new TextField(50);
        Button ok = new Button("确认");


        JTextArea textarea = new JTextArea(6,20);

        Choice color = new Choice();
        color.add("红色");
        color.add("绿色");
        color.add("蓝色");
        color.add("紫色");

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox male = new Checkbox("男性",cg,true);
        Checkbox female = new Checkbox("女性",cg,false);
        Checkbox marry = new Checkbox("是否已婚？");

        //组装套件
        Box box1 = Box.createHorizontalBox();
        box1.add(textfield);
        box1.add(ok);
        frame.add(box1,BorderLayout.SOUTH);

        Panel panel = new Panel();
        panel.add(color);
        panel.add(male);
        panel.add(female);
        panel.add(marry);

        Box box3 = Box.createVerticalBox();
        box3.add(textarea);
        box3.add(panel);

        Box box2 = Box.createHorizontalBox();
        box2.add(box3);
        box2.add(colorlist);
        frame.add(box2);

        frame.pack();
        frame.setVisible(true);
    }
}
