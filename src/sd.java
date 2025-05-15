import java.awt.*;

public class sd {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Panel panel=new Panel();
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(66, 152, 43));
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(157, 50, 50));
        frame.add(panel);
        frame.setVisible(true);
    }
}
