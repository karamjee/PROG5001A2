import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;


public class KK_SnakeGame extends JFrame {

    private Image snake;
    private JLabel Current_player_score;
    private JLabel snakelabel;
    private JButton quit;
    private JButton Click_to_play;
    private Graphics g;
    private JLabel Game_over;
    private JLabel Top_players_score;   
    private JLabel mySnakeGame; 
    private JLabel nameid;
    
     public KK_SnakeGame(String snakegame) {  
        
        super(snakegame); 
        Current_player_score = new JLabel("CURRENT PLAYER SCORE"); 
        mySnakeGame= new JLabel("MY SNAKE GAME");
        quit = new JButton("QUIT");
        Click_to_play = new JButton("CLICK TO PLAY"); 
        Game_over = new JLabel("GAME OVER");
        Top_players_score = new JLabel("TOP PLAYER'S SCORE");   
        snakelabel = new JLabel();
        nameid = new JLabel("PROG5001:2021 KARAMJEET KAUR");
       
           
        //North
        JPanel NPanel = new JPanel(new GridBagLayout());
        NPanel.setBackground(Color.BLUE);
        NPanel.setBounds(0,0,1500,100);
        mySnakeGame.setForeground(Color.white);
        GridBagConstraints Nconstraint= new GridBagConstraints();
        Nconstraint.anchor = GridBagConstraints.NORTH;
        Nconstraint.insets = new Insets(10, 10, 10, 10);
        NPanel.add(mySnakeGame,Nconstraint);
        
        //  West 
        JPanel WPanel = new JPanel(new GridBagLayout());
        WPanel.setBackground(Color.black);
        WPanel.setBounds(10,10,620,750);        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(30, 30, 30, 30);
         // Click_to_play
        constraints.gridx = 0;
        constraints.gridy = 1;  
        WPanel.add(Click_to_play, constraints);
        
        // Game_is_over
        constraints.gridx = 0;
        constraints.gridy = 0;     
        Game_over.setForeground(Color.white);
        WPanel.add(Game_over,constraints);
        
       
        
        // East
        JPanel EPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.EAST;
        constraints.insets = new Insets(12, 12, 12, 12);
        
        //Top_player_score
        constraints.gridx = 0;
        constraints.gridy = 0;     
        EPanel.add(Top_players_score, constraints);
        Top_players_score.setBorder(new LineBorder(Color.blue,1));        
        //Current_player_score
        constraints.gridx = 0;  
        constraints.gridy = 1;
        EPanel.add(Current_player_score, constraints);
        Current_player_score.setBorder(new LineBorder(Color.blue,1));        
        //Nameid
        constraints.gridx = 0;  
        constraints.gridy = 2;
        EPanel.add(nameid, constraints);
        nameid.setBorder(new LineBorder(Color.blue,1));        
        //Snake
        constraints.gridx = 0;  
        constraints.gridy = 3;
        
        snakelabel.setIcon(new ImageIcon("snake.png"));
        EPanel.add(snakelabel,constraints);        
        //Quit
        constraints.gridx = 0;  
        constraints.gridy = 4;
        EPanel.add(quit, constraints);   
        add(NPanel);
        add(WPanel);
        add(EPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();

        
        //make the form apprear in the screen centre
        
        
    }
    public static void main(String[] args) {        
//        EventQueue.invokeLater(() -> {
            //create the game with a game title as follow: The Snake Game (C) Your_Name
            JFrame sgame = new KK_SnakeGame("kk_snakeGame");
            sgame.setVisible(true);
//        });
    }
}