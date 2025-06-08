import javax.swing.*;
import java.awt.*;

public class TankClient extends JFrame {
        public static  final int Game_Width=1920;
        public static  final int Game_Height=1080;
        public void lauchFrame(){
            setSize(Game_Width,Game_Height);





            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(true);
        }

    public static void main(String[] args) {
       TankClient tc=new TankClient();
       tc.lauchFrame();
    }
}
