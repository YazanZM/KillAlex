import javax.swing.JFrame;

public class Game {

public static void main(String[] args) {
    JFrame frame = new JFrame("KillAlex v1.0");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new GamePanel());
    frame.pack();
    frame.setVisable(true);

}

}