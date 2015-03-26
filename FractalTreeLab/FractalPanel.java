import java.awt.*;
import javax.swing.JPanel;

public class FractalPanel extends JPanel
{
   private final int PANEL_WIDTH = 400;
   private final int PANEL_HEIGHT = 400;

   private final double SQ = Math.sqrt(3.0) / 6;

   private final int TOPX = 200, TOPY = 20;
   private final int LEFTX = 60, LEFTY = 300;
   private final int RIGHTX = 340, RIGHTY = 300;

   private int current;
   public FractalPanel (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.orange);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }
   public void drawFractal (Graphics g, int x, int y, int prvLength, int prvAngle)
   {
      
   }
   
   
   
   public void paintComponent (Graphics g)
   {
       super.paintComponent(g);
   }
}
