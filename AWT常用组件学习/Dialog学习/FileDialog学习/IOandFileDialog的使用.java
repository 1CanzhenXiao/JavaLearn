package FileDialog学习;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 *  本节主要学会使用FileDialog打开路径和存储路径
 *  学习getDirectory（）
 *  getFile（）
 *  在此基础上，增加其读与写的功能
 *  (注意，保存文件无法执行，发生不明错误)
 * **/

public class IOandFileDialog的使用 {
    public static void main(String[] args) throws IOException{
        Frame frame = new Frame("FileDialog学习");

        //新建两个按钮，分别是打开路径和保存路径
        Button button1 = new Button("打开路径(只能读取文本文件)");
        Button button2 = new Button("保存路径");

        //创建两个FileDialog,分别绑定两个按钮(由事件监听器绑定)
        FileDialog filedialog1 = new FileDialog(frame,"打开路径",FileDialog.LOAD);
        FileDialog filedialog2 = new FileDialog(frame,"保存路径",FileDialog.SAVE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filedialog1.setVisible(true);
                String path = filedialog1.getDirectory();
                String name = filedialog1.getFile();

                FileReader filereader = null;
                try {
                    filereader = new FileReader(path+name);
                    BufferedReader br = new BufferedReader(filereader);
                    String read = null;
                    while((read = br.readLine())!=null){
                        System.out.println(read);
                    }
                    filereader.close();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                System.out.println("打开的路径为："+path);
                System.out.println("打开的文件为："+name);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filedialog2.setVisible(true);
                String path = filedialog2.getDirectory();
                String name = filedialog2.getFile();

                try {
                    FileInputStream fileinputstream = new FileInputStream(name);
                    FileOutputStream fileoutputstream = new FileOutputStream(path+name);
                    int len;
                    while((len = fileinputstream.read())!=-1){
                        fileoutputstream.write(len);
                    }
                    fileinputstream.close();
                    fileoutputstream.close();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                System.out.println("保存的路径为："+path);
                System.out.println("保存的文件为："+name);
            }
        });

        //将两个按钮加入到窗口
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2);

        //将frame设置为最佳大小及可见
        frame.pack();
        frame.setVisible(true);
    }
}

