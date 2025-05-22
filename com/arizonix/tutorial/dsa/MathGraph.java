package com.arizonix.tutorial.dsa;

import javax.swing.*;
import java.awt.*;


public class MathGraph extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        // Draw X and Y axis
        g2.drawLine(0, height / 2, width, height / 2); // X-axis
        g2.drawLine(width / 2, 0, width / 2, height); // Y-axis

        g2.setColor(Color.BLUE);

        // Plotting y = 2x
        for (int x = -100; x <= 100; x++) {
            int scaledX = width / 2 + x;
            int scaledY = height / 2 - 2 * x;
            g2.fillOval(scaledX, scaledY, 3, 3);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graph of y = 2x");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new MathGraph());
        frame.setVisible(true);
    }
}

