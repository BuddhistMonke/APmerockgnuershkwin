package pkg;

import java.swing.SwingUtilities;

public class otherthing{
    public static void main(String args){
        SwingUtilities.invokeLater(new Runnable()){
            @Override
            public void run(){
                windowthing main = new windowthing();
                main.show();
            }
        }
    }
}