import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

abstract class KK_GameBoard extends JPanel {    
    int xcells = 30;   
    int ycells = 30;
    int szcell = 10;        
       
    public KK_GameBoard() {
        setPreferredSize(new Dimension(xcells * szcell, ycells * szcell));        
        setBackground(Color.black);
        setFocusable(true);        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    /** Method exit
     * user can exit the game
     * 
     */
    abstract void exit();
    
    /** Method resizeable
     * user can increase and decrease the size of window
     * 
     */
    abstract void resizeable();
    
}


