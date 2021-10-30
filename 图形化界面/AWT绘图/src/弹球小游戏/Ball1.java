package 弹球小游戏;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ball1 {
    //设置窗口大小
    private final int FRAME_X = 400;
    private final int FRAME_Y = 500;
    //设置球大小
    private final int BALL_SIZE = 16;
    //设置球位置
    private int BALL_X = 200;
    private int BALL_Y = 200;
    //设置球板大小
    private final int BOARD_HEIGHT = 16;
    private final int BOARD_WIDTH = 60;
    //设置球板位置
    private int BOARD_X = 200;
    private final int BOARD_Y = 440;
    //设置球移动速度
    private int SPEED_X = 20;
    private int SPEED_Y = 20;
    //设置游戏结束状态
    private boolean IsOver = false;

    class MyCanvas extends Canvas{  //设置画板
        @Override
        public void paint(Graphics g) {
            if(IsOver == false){
                //绘制小球，并设定小球初始位置
                g.setColor(Color.RED);
                g.fillOval(BALL_X,BALL_Y,BALL_SIZE,BALL_SIZE);

                //绘制球板，设定板的初始位置
                g.setColor(Color.ORANGE);
                g.fillRect(BOARD_X,BOARD_Y,BOARD_WIDTH,BOARD_HEIGHT);

            }else if(IsOver == true){
                g.setColor(Color.BLACK);
                g.drawString("GAME OVER",200,300);
            }
        }
    }
    MyCanvas my = new MyCanvas();

    //设置时间类，让球运动,并让球间隔时间执行动作事件
    Timer timer;
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(BALL_X<=0||(BALL_X+BALL_SIZE)>=FRAME_X) SPEED_X = -SPEED_X;
            if(BALL_Y<=0||(BALL_Y>(BOARD_Y-BALL_SIZE)&&BALL_X>BOARD_X&&BALL_X<(BOARD_X+BOARD_WIDTH))) SPEED_Y = -SPEED_Y;
            if((BALL_Y+BALL_SIZE)>=FRAME_Y){
                IsOver = true;
                timer.stop();
                my.repaint();
            }
            BALL_X += SPEED_X;
            BALL_Y += SPEED_Y;
            my.repaint();
        }
    }

    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();   //获取键盘按钮参数，方便下面的操作
            if(key == KeyEvent.VK_LEFT){    //若按下方向键左键
                if(BOARD_X>0) BOARD_X-=30;      //在边框范围内，板向左
            }else if(key == KeyEvent.VK_RIGHT){     //若按下方向键右键
                if(BOARD_X<FRAME_X-BOARD_WIDTH) BOARD_X+=10;    //在边框范围内板向右移动
            }
        }
    }

    //设置窗口
    Frame frame = new Frame("弹球小游戏初版");

    public void init(){     //组装组件
        my.setSize(new Dimension(FRAME_X,FRAME_Y));
        my.addKeyListener(new MyKeyListener());
        frame.addKeyListener(new MyKeyListener());
        frame.addWindowListener(new WindowAdapter() {@Override public void windowClosing(WindowEvent e) { System.exit(0); }});
        MyActionListener m = new MyActionListener();
        frame.add(my);
        //设置动作事件（让球运动）

        timer = new javax.swing.Timer(200,m);
        timer.start();
        //设置窗口可见
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Ball1().init();
    }
}
