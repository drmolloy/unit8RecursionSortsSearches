import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FractalPanelViewer
{
    private final int WIDTH = 400;
    private final int HEIGHT = 500;
    private JLabel titleLabel, orderLabel;
    private FractalPanel drawing;
    private JPanel panel, tools;
    private JFrame frame;
    public static void main(String[] args)
    {
        FractalPanelViewer viewer = new FractalPanelViewer();
    }

    public FractalPanelViewer()
    {
        tools = new JPanel ();
        tools.setLayout (new BoxLayout(tools, BoxLayout.X_AXIS));
        tools.setBackground (Color.black);
        tools.setOpaque (true);

        panel = new JPanel();
        panel.add (tools);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }
}
