package design;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        this.setBackground(Color.white);
        
        g.setColor(Color.blue);
        g.fill3DRect(25, 25, 100, 30, true);
       
        
        g.setColor(new Color(190, 81, 215));
        g.fill3DRect(25, 65, 100, 30, true);
       
        
        g.setColor(Color.orange);
        g.drawString(" Click Me ", 25, 120);
    }
}
