package Panel_Shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class LeftRoundPanel extends JPanel {
    private int cornerRadius = 30;

    public LeftRoundPanel() {
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
        
        // Start at top-right (square)
        path.moveTo(w, 0);
        // Top edge towards left
        path.lineTo(cornerRadius, 0);
        // Top-left curve
        path.quadTo(0, 0, 0, cornerRadius);
        // Left edge
        path.lineTo(0, h - cornerRadius);
        // Bottom-left curve
        path.quadTo(0, h, cornerRadius, h);
        // Bottom edge back to right
        path.lineTo(w, h);
        // Right edge back to top
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