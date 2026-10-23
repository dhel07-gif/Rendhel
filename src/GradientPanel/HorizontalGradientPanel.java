package GradientPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;

public class HorizontalGradientPanel extends JPanel {
    private Color startColor;
    private Color endColor;
    private float fadeFraction; // Controls how far the gradient stretches (0.0 to 1.0)

    // Constructor with default full-width fade (1.0)
    public HorizontalGradientPanel(Color startColor, Color endColor) {
        this(startColor, endColor, 1.0f);
    }

    // Constructor with custom fade fraction
    public HorizontalGradientPanel(Color startColor, Color endColor, float fadeFraction) {
        this.startColor = startColor;
        this.endColor = endColor;
        this.fadeFraction = Math.max(0.0f, Math.min(1.0f, fadeFraction));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        
        int width = getWidth();
        int height = getHeight();

        // Calculate where the gradient stops based on the fade fraction
        float gradientWidth = width * fadeFraction;
        if (gradientWidth < 1) gradientWidth = 1;

        // LinearGradientPaint handles custom spread and handles the remaining space smoothly
        float[] fractions = {0.0f, 1.0f};
        Color[] colors = {startColor, endColor};
        
        LinearGradientPaint gradient = new LinearGradientPaint(
            0, 0, gradientWidth, 0, 
            fractions, colors, 
            CycleMethod.NO_CYCLE
        );
        
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, width, height);
    }
    
    // Dynamic color updates
    public void setColors(Color startColor, Color endColor) {
        this.startColor = startColor;
        this.endColor = endColor;
        repaint();
    }

    // Adjust the fade length dynamically (0.0 = no spread, 1.0 = stretches full width)
    public void setFadeFraction(float fadeFraction) {
        this.fadeFraction = Math.max(0.0f, Math.min(1.0f, fadeFraction));
        repaint();
    }
}