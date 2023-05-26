package pkg;

import javax.swing.JFrame;

public class windowthing{
    private JFrame window;
    public windowthing(){
        window = new JFrame();
        window.setTitle("bruh");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 500);
        window.setLocationRelativeTo(null);
    }
    public void show(){
        window.setVisible(true);
    }
}