import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class sd {
    public static void main(String[] args) {
      new keyframe();
    }
}
class keyframe extends Frame{
    public keyframe(){
        setBounds(200,200,500,500);
        setVisible(true);
        addKeyListener(new mykeylistener());
        addWindowListener(new mywindowlistener());
    }
}
class mykeylistener extends KeyAdapter{
    @Override
    public void keyPressed(KeyEvent e) {
       int keycode=e.getKeyCode();
       if(keycode==KeyEvent.VK_UP){
           System.out.println("按下了上贱");
       }
    }
}
class mywindowlistener extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}