package Test9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Stack;

public class Test9plus {
    public static void main(String[] args) {
        //设置容器
        Frame frame = new Frame("究极简陋计算器");
        frame.setLayout(new BorderLayout());
        Panel panel1,panel2;
        panel1 = new Panel(); panel1.setLayout(new FlowLayout(1));
        panel2 = new Panel(); panel2.setLayout(new GridLayout(4,4));
        TextArea textarea = new TextArea(1,40);
        textarea.setEditable(false);

        //设置17个按钮
        Button[] buttons = new Button[17];
        for(int i=0;i<10;i++){      //为按钮字体设置颜色
            buttons[i] = new Button(String.valueOf(i));
            buttons[i].setForeground(Color.BLUE);
        }
        buttons[10] = new Button("*");
        buttons[11] = new Button("/");
        buttons[12] = new Button("-");
        buttons[13] = new Button(".");
        buttons[14] = new Button("+");
        buttons[15] = new Button("=");
        buttons[16] = new Button("清空");
        for(int i=10;i<17;i++){
            buttons[i].setForeground(Color.RED);
        }

        //组装组件
        frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
        panel1.add(textarea); panel1.add(buttons[16]);
        panel2.add(buttons[0]); panel2.add(buttons[1]); panel2.add(buttons[2]); panel2.add(buttons[10]);
        panel2.add(buttons[3]); panel2.add(buttons[4]); panel2.add(buttons[5]); panel2.add(buttons[11]);
        panel2.add(buttons[6]); panel2.add(buttons[7]); panel2.add(buttons[8]); panel2.add(buttons[12]);
        panel2.add(buttons[9]); panel2.add(buttons[13]); panel2.add(buttons[14]); panel2.add(buttons[15]);
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2);

        //事件监听器绑定
        Stack<Character> first = new Stack<>();     //用来储存运算符
        Stack <String>end = new Stack();      //用来存放后辍和算式
        Stack <Double>end1 = new Stack<>();     //用来计算

        for(int i=0;i<15;i++){      //为15个按钮设置事件，当1鼠标点击按钮时在输出窗口显示按下的数字或符号
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textarea.append(e.getActionCommand());
                }
            });
        }
        buttons[15].addActionListener(new ActionListener() {    //为等于号设置事件监听器，主要运算在该按钮中执行
            @Override
            public void actionPerformed(ActionEvent e) {        //计算方法为字符串后辍和
                textarea.append("=");       //当按下按钮后，往输入框中键入"="号，开始计算
                String s = textarea.getText();      //将输入的计算式转为字符串形式
                int index = 0;
                for(int i=0;i<s.length();i++){      //逐个扫描，运用双指针的方法将数字与计算符依次压入栈内，要使用这种方法是因为小数的存在可能性
                    if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'){
                        end.push(s.substring(index,i));
                        index = i+1;
                        if(s.charAt(i)=='+'||s.charAt(i)=='-'){     //如果计算符为加号或者减号，得进行优先级比较
                            if(first.empty()==false){       //如果计算符栈不为空，再进行计算符优先级比较
                                while(first.peek()=='*'||first.peek()=='/'){        //当加减号前面为乘除号时，得将其请出放入后辍和栈中
                                    end.push(String.valueOf(first.pop()));      //将顶层高级计算符弹出并放入后辍和栈
                                }
                                first.push(s.charAt(i));    //再将加减号存入计算符栈中
                            }
                            else{
                                first.push(s.charAt(i));    //如果计算符栈中无符号则将计算符直接压入
                            }
                        }else{
                            first.push(s.charAt(i));    //如果其为高等级计算符则直接压入计算符栈中
                        }
                    }else if(s.charAt(i)=='='){
                        end.push(s.substring(index,i));     //如果到最尾端（等于号），则将等于号和前一个运算符之间的字符压入后辍和栈中
                    }
                }
                for(int j=0;j<first.size();j++){    //将剩余的计算符压入后辍和栈中
                    end.push(String.valueOf(first.pop()));
                }

                String [] a = new String[end.size()];   //创建一个字符串型数组，方便后辍和计算
                for(int i=end.size()-1; i>=0 ; i--) a[i] = end.pop();   //将后辍和栈的所有元素弹出并放入字符串数组中，按倒叙排放（栈先进后出原则）
                for(int i=0;i<a.length;i++){    //遍历字符串数组，直到最后一个字符数组结束
                    if(a[i].equals("+")){   //计算方法是，当遇到运算符时，将栈顶的两个数字弹出计算再压入，到循环结束时栈底的第一个数字就是正确答案
                        double n1 = end1.pop();
                        double n2 = end1.pop();
                        end1.push(n2+n1);
                    }
                    else if(a[i].equals("-")){
                        double n1 = end1.pop();
                        double n2 = end1.pop();
                        end1.push(n2-n1);
                    }
                    else if(a[i].equals("*")){   //这里很重要，为什么不用==呢，因为==比较的是两者的地址是否相同，相同才返回true，但这里是为了比较内容
                        double n1 = end1.pop();
                        double n2 = end1.pop();
                        end1.push(n2*n1);
                    }
                    else if(a[i].equals("/")){
                        double n1 = end1.pop();
                        double n2 = end1.pop();
                        end1.push(n2/n1);
                    }else{
                        end1.push(Double.parseDouble(a[i]));    //所有不是运算符的都压入计算栈
                    }
                }
                textarea.setText(String.valueOf(end1.pop()));
            }
        });
        buttons[16].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(end.empty()==false){
                    for(int i=0;i<end.size()+1;i++){
                        end.pop();
                    }
                }
                textarea.setText("");
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //frame可见
        frame.pack();
        frame.setVisible(true);
    }
}
