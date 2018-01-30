package design;

import javax.swing.JFrame;

public class Design {
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Graphic p = new Graphic();
        f.add(p);
        f.setSize(400, 250);
        f.setVisible(true);
        
    }
    
}
