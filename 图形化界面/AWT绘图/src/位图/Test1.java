package 位图;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

/**
    @version 2.0
    @author W'd'n'm'd
    试水文档注释
 */

public class Test1 {
    //创建窗口
    private Frame frame = new Frame("位图实例");

    //设置画图区的宽高
    private final int AREA_WIDTH = 500;
    private final int AREA_HEIGHT = 600;

    //设置鼠标坐标
    int M_X = -1;
    int M_Y = -1;

    //设置菜单，选择颜色用
    private PopupMenu popupmenu = new PopupMenu();  //右键呼出的菜单栏
    private MenuItem red = new MenuItem("红色");
    private MenuItem green = new MenuItem("蓝色");
    private MenuItem blue = new MenuItem("蓝色");

    //设置画笔颜色
    private Color forceColor = Color.BLACK;

    //设置位图对象，并将其关联Graphics类对象
    BufferedImage image = new BufferedImage(AREA_WIDTH,AREA_HEIGHT,BufferedImage.TYPE_INT_RGB);
    Graphics g = image.getGraphics();   //画笔Graphics

    //设置画板
    class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            g.drawImage(image,0,0,null);
        }
    }
    MyCanvas my = new MyCanvas();   //创建画板对象my

    void init(){
        ActionListener actionlistener = new ActionListener() {  //匿名类实现接口
            @Override
            public void actionPerformed(ActionEvent e) {    //作用是为了实现菜单选择框的功能
                String s = e.getActionCommand();    //得到菜单选择框的文字，并对文字做出相应反应
                switch (s){     //forceColor在上方有定义，是Color类的对象，并将相应颜色赋给forceColor
                    case "红色":
                        forceColor = Color.RED;
                        break;
                    case "绿色":
                        forceColor = Color.GREEN;
                        break;
                    case "蓝色":
                        forceColor = Color.BLUE;
                        break;
                }
            }
        };

        //让位图背景色为白色
        g.setColor(Color.WHITE);
        g.fillRect(0,0,AREA_WIDTH,AREA_HEIGHT);
        my.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                M_X = e.getX();
                M_Y = e.getY();
                if(M_X>0&&M_Y>0){
                    g.setColor(forceColor);
                    g.drawLine(M_X,M_Y,e.getX(),e.getY());
                }
                my.repaint();
            }
        });
        //将事件监听器与菜单项绑定
        red.addActionListener(actionlistener);
        blue.addActionListener(actionlistener);
        green.addActionListener(actionlistener);
        //将菜单栏组装
        popupmenu.add(red);
        popupmenu.add(green);
        popupmenu.add(blue);
        my.add(popupmenu);
        //将画板与鼠标的事件监听器绑定
        my.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean popuptrigger = e.isPopupTrigger();
                if(popuptrigger){
                    popupmenu.show(my,e.getX(),e.getY());
                }
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.add(my);
        my.setPreferredSize(new Dimension(AREA_WIDTH,AREA_HEIGHT));
        //设置窗口可见及最佳大小
        frame.setVisible(true);
        frame.pack();
    }

    public static void main(String[] args) {
        new Test1().init();
    }
}
