package Problem8;

import javax.swing.*;
import java.awt.*;

public class Rectangle implements Drawable{
    public void draw() {
        // Create a new JFrame for displaying the rectangle
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);

        // Create a JPanel for custom drawing
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to blue and fill a rectangle
                g.setColor(Color.BLUE);
                g.fillRect(100, 100, 200, 200);
            }
        };

        // Add the panel to the frame
        jFrame.add(panel);
    }
}
