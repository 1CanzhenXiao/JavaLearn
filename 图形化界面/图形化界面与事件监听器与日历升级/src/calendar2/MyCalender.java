package calendar2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Calendar{
    static Frame frame;
    static TextArea textarea;
    static Panel panel;
    static TextField textfield;
    static Button ok;
    //全部static的原因是为了让print方法直接调用

    public void init(){
        frame = new Frame("万年历");
        textarea = new TextArea(20,70);     //创建多行文本框
        panel = new Panel();
        textfield = new TextField(20);
        ok = new Button("确认");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ok.addActionListener(new ActionListener() {     //匿名内部类实现接口

            public void actionPerformed(ActionEvent e) {

                textarea.setText(textfield.getText());
                String a = textarea.getText();
                int year = Integer.parseInt(a);

                int[] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31};  //将12个月的日数输入到一个数组中
                if(year%4==0&&year%100!=0) monthDay[1]=29;  //若年份不为百位整数年且可被4整除，则为闰年
                else if(year%100==0&&year%400==0) monthDay[1]=29;   //若其为百整数年且能被400整除，也是闰年
                //System.out.println(monthDay[1]); (测试是否有效)

                int date=0;
                for(int y=1900;y<year;y++) {
                    if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) date++;
                }
                int blank = ((year - 1900)*365 + date)% 7;	//一年的第一个月是星期几（需要空几个空格出来）


                String[] month = new String[] {"January","February","Match","April","May","June","July",
                        "August","September","October","November","December"};
                for(int i=0;i<12;i++) {
                    textarea.append("\n");
                    textarea.append("\n");
                    textarea.append("\"\t\tMonth's name is \"" + month[i]);
                    textarea.append("\n");
                    textarea.append("=========================================================");
                    textarea.append("\n");
                    textarea.append("\tMon\tThu\tWed\tThe\tFri\tSat\tSun");
                    textarea.append("\n");
                    int num = 0;
                    for (int l = 0; l < blank; l++) {
                        /*System.out.printf("%c", '\t');*/
                        textarea.append("\t");
                        num = blank;
                    }
                    for (int j = 1; j < monthDay[i] + 1; j++) {
                        /*System.out.printf("%c%d",'\t',j);*/
                        textarea.append("\t");
                        textarea.append(String.valueOf(j));
                        num++;
                        if (num % 7 == 0) textarea.append("\n");    /*System.out.print('\n');*/
                        blank = num % 7;
                    }
                }
            }
        });
        panel.add(textfield);
        panel.add(ok);
        frame.add(panel,BorderLayout.SOUTH);
        frame.add(textarea);

        frame.pack();   //每次都要调整到最佳大小
        frame.setVisible(true);     //让frame可见
    }
}


public class MyCalender {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.init();
    }
}
