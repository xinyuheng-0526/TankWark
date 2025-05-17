import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class sd {
    public static void main(String[] args) {
      new windowframe();
    }
}
class windowframe extends Frame{
    public windowframe(){
         setBounds(200,200,300,400);
         setBackground(Color.red);
         setVisible(true);
         addWindowListener(new mywindowlistener());
    }
    class mywindowlistener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}