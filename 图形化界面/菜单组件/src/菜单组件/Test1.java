package 菜单组件;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("菜单组件演示");
        MenuBar menubar = new MenuBar();
        Menu file,edit,format;
        MenuItem autoFeed,copy,paste,comment,cancelComment;

        file = new Menu("文件");
        edit = new Menu("编辑");
        format = new Menu("格式");

        autoFeed = new MenuItem("自动换行");
        copy = new MenuItem("复制");
        paste = new MenuItem("粘贴");
        comment = new MenuItem("注释");      //annotation
        cancelComment = new MenuItem("取消注释");

        class Init{
            void init(){
                format.add(comment);
                format.add(cancelComment);
                edit.add(autoFeed);
                edit.add(copy);
                edit.add(paste);
                edit.add(new MenuItem("-"));
                edit.add(format);
                menubar.add(file);
                menubar.add(edit);
                frame.setMenuBar(menubar);
                frame.add(new TextArea());

                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

                frame.pack();
                frame.setVisible(true);
            }
        }

        new Init().init();
    }
}
