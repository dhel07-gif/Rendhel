package GradientPanel;

import javax.swing.*;
import java.awt.*;

public class VerticalGradientPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Cast to Graphics2D for better control
        Graphics2D g2d = (Graphics2D) g;
        
        // Define colors and the gradient
        // GradientPaint(x1, y1, color1, x2, y2, color2)
        Color color1 = new Color(255,204,204);
        Color color2 = new Color(255,153,204);
        
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        
        // Apply the paint and fill the panel
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}