package LayoutManager演示;
import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("flowlayout演示");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for(int i=0;i<100;i++) frame.add(new Button("" + i));
        frame.pack();
        frame.setVisible(true);
    }
}
