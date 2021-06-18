package Test9;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test9 {
    public static void main(String[] args) {
        Frame frame = new Frame("究极简陋计算器");
        frame.setLayout(new BorderLayout());
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        //创建组件
        Button button1 = new Button("7");
        Button button2 = new Button("8");
        Button button3 = new Button("9");
        Button button4 = new Button("/");
        Button button5 = new Button("4");
        Button button6 = new Button("5");
        Button button7 = new Button("6");
        Button button8 = new Button("*");
        Button button9 = new Button("1");
        Button button10 = new Button("2");
        Button button11 = new Button("3");
        Button button12 = new Button("-");
        Button button13 = new Button("0");
        Button button14 = new Button(".");
        Button button15 = new Button("=");
        Button button16 = new Button("+");
        Button button = new Button("清空");
        //部件美化
        button1.setForeground(Color.BLUE);
        button2.setForeground(Color.BLUE);
        button3.setForeground(Color.BLUE);
        button4.setForeground(Color.RED);
        button5.setForeground(Color.BLUE);
        button6.setForeground(Color.BLUE);
        button7.setForeground(Color.BLUE);
        button8.setForeground(Color.RED);
        button9.setForeground(Color.BLUE);
        button10.setForeground(Color.BLUE);
        button11.setForeground(Color.BLUE);
        button12.setForeground(Color.RED);
        button13.setForeground(Color.BLUE);
        button14.setForeground(Color.CYAN);
        button15.setForeground(Color.RED);
        button16.setForeground(Color.RED);
        button.setForeground(Color.GREEN);

        //组装配件
        class Init{
            void init(){
                //按钮群的组装
                panel2.setLayout(new GridLayout(4,4));
                panel2.add(button1);
                panel2.add(button2);
                panel2.add(button3);
                panel2.add(button4);
                panel2.add(button5);
                panel2.add(button6);
                panel2.add(button7);
                panel2.add(button8);
                panel2.add(button9);
                panel2.add(button10);
                panel2.add(button11);
                panel2.add(button12);
                panel2.add(button13);
                panel2.add(button14);
                panel2.add(button15);
                panel2.add(button16);
                frame.add(panel2);
                //输入框的组装
                panel1.setLayout(new FlowLayout());
                TextField textfield = new TextField(15);
                textfield.setEditable(false);   //不能编辑
                panel1.add(textfield);
                panel1.add(button);
                frame.add(panel1,BorderLayout.NORTH);
                //将按钮与事件监听器绑定，赋予功能（大工程）
                //创建一个字符串，并用StringBuilder类包装字符串
                String end = "";
                StringBuilder sb = new StringBuilder(end);
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button10.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button11.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button12.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button13.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button14.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button15.addActionListener(new ActionListener() {       //等于号，最麻烦的一个
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sb.append(e.getActionCommand());
                        double x = 0,y = 0;
                        char a = ' ';
                        int index = 0;
                        for(int i=0;i<sb.length();i++){
                            if(a == ' '&&(sb.charAt(i)=='+'||sb.charAt(i)=='-'||sb.charAt(i)=='*'||sb.charAt(i)=='/')){
                                a = sb.charAt(i);
                                x = Double.parseDouble(sb.substring(index,i));
                                index = i+1;
                            }else if((a != ' '&&(sb.charAt(i)=='+'||sb.charAt(i)=='-'||sb.charAt(i)=='*'||sb.charAt(i)=='/'))||sb.charAt(i)=='='){
                                y = Double.parseDouble(sb.substring(index,i));
                                if(a=='+'){
                                    x = x + y;
                                    y=0;
                                    a = sb.charAt(i);
                                    index = i+1;
                                }
                                else if(a=='-'){
                                    x = x - y;
                                    y = 0;
                                    a = sb.charAt(i);
                                    index = i+1;
                                }
                                else if(a=='*'){
                                    x = x * y;
                                    y = 0;
                                    a = sb.charAt(i);
                                    index = i+1;
                                }
                                else if(a=='/'){
                                    x = x/y;
                                    y = 0;
                                    a = sb.charAt(i);
                                    index = i;
                                }
                                else if(a==' '){
                                    x = y;
                                }
                            }
                        }textfield.setText(String.valueOf(x));
                    }
                });
                button16.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText(e.getActionCommand());
                        sb.append(e.getActionCommand());
                    }
                });
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textfield.setText("");
                        if(sb!=null) sb.delete(0,sb.length());      //这里delete方法，end并不删除，删除到end前一个
                    }
                });
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

                //设置frame可见，frame最佳大小
                frame.pack();
                frame.setVisible(true);
            }
        }

        new Init().init();
    }
}
