import java.awt.EventQueue;
import javax.swing.JFrame;

public class KK_SnakeGame extends JFrame {

    public KK_SnakeGame(String gameTille) {        
        setTitle(gameTille);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();        
    }
    
    public static void main(String[] args) {        
        EventQueue.invokeLater(() -> {
            //create the game with a game title as follow: The Snake Game (C) Your_Name
            JFrame sgame = new KK_SnakeGame("New Snake");
            sgame.setVisible(true);
        });
    }
}
