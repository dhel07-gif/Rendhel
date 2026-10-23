package Panel_Shapes;

import javax.swing.*;
import java.awt.*;

public class RoundedGradientPanel extends JPanel {
    private int cornerRadius = 30;

    public RoundedGradientPanel() {
        setOpaque(false); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Color startColor = new Color(255,51,102);
        Color endColor = new Color(255, 153, 204);

        // Create the gradient
        GradientPaint gradient = new GradientPaint(
            0, 0, startColor, 
            getWidth(), getHeight(), endColor
        );

        g2.setPaint(gradient);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
    }

    public int getCornerRadius() { return cornerRadius; }
    public void setCornerRadius(int radius) { 
        this.cornerRadius = radius; 
        repaint(); 
    }
}