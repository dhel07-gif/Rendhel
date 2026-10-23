package Panel_Shapes;

import javax.swing.*;
import java.awt.*;

public class circlePanel extends JPanel {

    public circlePanel() {
        setOpaque(false); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Find the smaller dimension to keep it a perfect circle
        int size = Math.min(getWidth(), getHeight());
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;
        
        g2.setColor(getBackground());
        g2.fillOval(x, y, size, size);
        g2.dispose();
    }

    @Override
    public boolean contains(int x, int y) {
        // Restrict mouse clicks/events strictly to the circular area
        int radius = Math.min(getWidth(), getHeight()) / 2;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        
        return Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) <= Math.pow(radius, 2);
    }
}