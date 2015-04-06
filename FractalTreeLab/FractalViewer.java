import java.awt.*;
import javax.swing.*;

public class FractalViewer
{
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    private FractalPanelViewer drawing;
    private JFrame frame;
    
    public static void main(String[] args)
    {
        FractalViewer viewer = new FractalViewer();
    }
    
    public FractalViewer()
    {
        drawing = new FractalPanelViewer();
        frame = new JFrame();
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH,HEIGHT);
        frame.add(drawing);
        frame.setVisible(true);
    }
}
