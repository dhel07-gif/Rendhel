package GradientPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class DiagonalGradientPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // 1. Define start and end points for the diagonal
        Point2D start = new Point2D.Float(0, 0); // Top-left
        Point2D end = new Point2D.Float(getWidth(), getHeight()); // Bottom-right

        // 2. Define fractions (positions of colors from 0.0 to 1.0)
        float[] dist = {0.0f, 1.0f};

        // 3. Define colors at those fractions
        Color[] colors = {new Color(255,51,102), new Color(102,0,102)};

        // 4. Create the LinearGradientPaint
        LinearGradientPaint lgp = new LinearGradientPaint(
            start, 
            end, 
            dist, 
            colors, 
            MultipleGradientPaint.CycleMethod.NO_CYCLE
        );

        // 5. Apply the paint
        g2d.setPaint(lgp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}