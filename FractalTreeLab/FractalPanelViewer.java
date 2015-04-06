import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Line2D;

public class FractalPanelViewer extends JPanel
{
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    
    private final double smallFactor = .7;
    private final double angle = 25;
    
    
    public FractalPanelViewer()
    {
        setBackground(Color.red);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void drawFractal(double x, double y, double prevLength, double prevAngle, Graphics2D g2)    {
        double newLength = prevLength*smallFactor;
        if(newLength < 10)
        {
        return;
        }
        else
        {
            double leftAngle = prevAngle - angle;
            double rightAngle = prevAngle + angle;
            double deltaXLeft = newLength * Math.sin(Math.toRadians((leftAngle)));
            double deltaYLeft = newLength * Math.cos(Math.toRadians((leftAngle)));
            double deltaXRight = newLength * Math.sin(Math.toRadians((leftAngle)));
            double deltaYRight = newLength * Math.cos(Math.toRadians((leftAngle)));
            double xLeft = x + deltaXLeft;
            double xRight = x + deltaXRight;
            double yLeft = y - deltaYLeft;
            double yRight = y - deltaYRight;
            g2.draw(new Line2D.Double(x,y,xLeft,yLeft));
            g2.draw(new Line2D.Double(x,y,xRight,yRight));
            drawFractal(xLeft,yLeft,newLength,leftAngle,g2);
            drawFractal(xRight,yRight,newLength,rightAngle,g2);
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.blue);
        drawFractal(WIDTH/2,HEIGHT,250, angle,g2);
    }
}
