import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Write a description of class Snake here.
 *
 * @author (Karamjeet kaur)
 * @version (2.0 )
 * May 13, 2021
 */
public class KK_Snake  extends JPanel
{
    
    Image head;
    Image tail;

    /**
     * Constructor for objects of class Snake
     */
    public KK_Snake() {
        // initialise instance variables   
        head = new ImageIcon("images/head.png").getImage();
        tail = new ImageIcon("images/tail.png").getImage();
        //img = img.getScaledInstance(width, height, Image.SCALE_DEFAULT);
        Dimension size = new Dimension(35, 35);
        setPreferredSize(size);
        
    }
    
    public void paintComponent(Graphics g) {
        g.drawImage(head, 77, 40, null);
        repaint();
        for(int i=1; i<=3;i++)
        {
            g.drawImage(tail, 80, 60+(i*50), null);
            repaint();
        }
        
        for(int j=1; j<=2;j++)
        {
            g.drawImage(tail, 80+(j*65), 210, null);
            repaint();
        }
        
        

        g.drawImage(tail, 209, 160, null);
        
    }

    
    public static void main(String[] args) {        
       JFrame frame = new JFrame("Image Snake");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       KK_Snake panel = new KK_Snake();
       
       frame.add(panel);
       frame.setSize(600, 750);
       frame.setVisible(true);
    }

    
    /**
     * Method Move
     * this method will help the snake to move in various directions with the help of Arrow keys
     */
    public void Move()
    {
    
    }
    
    /**
     * Method EatPrey
     * the snake will change it direction through arrow keys
     */
    public void EatPrey()
    {
    
    }
    
    /**
     * Method grow
     * the snake will grow longer when it will eat prey
     */
    public void Grow()
    {
    
    }
    
  }