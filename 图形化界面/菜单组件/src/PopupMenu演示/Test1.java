package PopupMenu演示;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("PopupMenu演示");
        TextArea textarea = new TextArea(6,20);
        Panel panel = new Panel();
        panel.setSize(500,500);

        //设置菜单栏
        PopupMenu popupmenu = new PopupMenu();
        Menu file,edit,format;
        MenuItem autoFeed,copy,paste,comment,cancelComment;
        format = new Menu("格式");
        autoFeed = new MenuItem("自动换行");
        copy = new MenuItem("复制");
        paste = new MenuItem("粘贴");
        comment = new MenuItem("注释");      //annotation
        cancelComment = new MenuItem("取消注释");


        class Init{     //初始化类(组装容器)
            void init(){    //初始化方法
                //设置PopupMenu
                popupmenu.add(autoFeed);
                popupmenu.add(copy);
                popupmenu.add(paste);
                popupmenu.add(new MenuItem("-"));
                popupmenu.add(format);
                format.add(comment);
                format.add(cancelComment);
                panel.add(popupmenu);

                //设置TextArea和Panel，将其加入frame窗口
                frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
                frame.add(textarea);
                frame.add(panel);

                //添加事件监听器
                panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        Boolean a = e.isPopupTrigger();
                        if(a){
                            popupmenu.show(panel,10,30);
                        }
                    }
                });

                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

                //将frame设置为可见，最佳大小
                frame.pack();
                frame.setVisible(true);
            }
        }

        new Init().init();
    }
}
