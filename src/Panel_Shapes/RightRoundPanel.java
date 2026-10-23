package Panel_Shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class RightRoundPanel extends JPanel {
    private int cornerRadius = 30;

    public RightRoundPanel() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int w = getWidth();
        int h = getHeight();

        // Create the custom path
        Path2D.Float path = new Path2D.Float();
        
        // Start at top-left (square)
        path.moveTo(0, 0);
        // Top edge towards right
        path.lineTo(w - cornerRadius, 0);
        // Top-right curve
        path.quadTo(w, 0, w, cornerRadius);
        // Right edge
        path.lineTo(w, h - cornerRadius);
        // Bottom-right curve
        path.quadTo(w, h, w - cornerRadius, h);
        // Bottom edge back to left
        path.lineTo(0, h);
        // Left edge back to top
        path.closePath();

        g2.setColor(getBackground());
        g2.fill(path);
        g2.dispose();
    }

    public int getCornerRadius() { return cornerRadius; }
    public void setCornerRadius(int radius) { 
        this.cornerRadius = radius; 
        repaint(); 
    }
}