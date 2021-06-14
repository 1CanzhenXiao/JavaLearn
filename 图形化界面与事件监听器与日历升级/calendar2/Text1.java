package calendar2;

import java.awt.*;

public class Text1 {
    public static void main(String[] args) {
        Frame frame = new Frame("ABNBND");
        TextArea textarea = new TextArea();
        frame.add(textarea);
        for(int i=0;i<100;i++){
            textarea.append("\tASDSADASDSADSADDASDA");
            textarea.append("\n");
        }


        frame.pack();
        frame.setVisible(true);
    }
}
