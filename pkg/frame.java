package pkg;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class frame extends JFrame implements KeyListener {
    boolean lready, rready;
    boolean over, justwon;
    String lchoice, rchoice, strrock, strpaper, strscissor;
    JLabel rock1, paper1, scissor1, rock2, paper2, scissor2;
    JLabel redwins, bluewins, rwinmessage, bwinmessage, tiemessage;
    JLabel lwait, rwait, restartlabel, choiceslabel;
    int numlwins, numrwins, stoopid;
    

    ImageIcon image_rock, image_paper, image_scissor;
    
    public frame(){
        this.setTitle("RPC");
        this.setBounds(200, 200, 1200, 600);        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GRAY);
        this.addKeyListener(this);
        this.setVisible(true);
        /* 
        image_rock = new ImageIcon(new ImageIcon("rock.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        image_paper = new ImageIcon(new ImageIcon("paper.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        image_scissor = new ImageIcon(new ImageIcon("scissor.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        */
        rock1 = new JLabel(image_rock);
        rock1.setText("Rock");
        rock1.setIcon(image_rock);
        rock1.setBackground(Color.DARK_GRAY);
        rock1.setOpaque(true);
        rock1.setHorizontalTextPosition(JLabel.CENTER);
        rock1.setVerticalTextPosition(JLabel.BOTTOM);
        rock1.setBounds(50, 75, 100, 100);
        rock1.setVisible(true);

        paper1 = new JLabel(image_paper);
        paper1.setText("Paper");
        paper1.setIcon(image_paper);
        paper1.setBackground(Color.ORANGE);
        paper1.setOpaque(true);
        paper1.setHorizontalTextPosition(JLabel.CENTER);
        paper1.setVerticalTextPosition(JLabel.BOTTOM);
        paper1.setBounds(50, 225, 100, 100);
        paper1.setVisible(true);

        scissor1 = new JLabel(image_scissor);
        scissor1.setText("Scissors");
        scissor1.setIcon(image_scissor);
        scissor1.setBackground(Color.CYAN);
        scissor1.setOpaque(true);
        scissor1.setHorizontalTextPosition(JLabel.CENTER);
        scissor1.setVerticalTextPosition(JLabel.BOTTOM);
        scissor1.setBounds(50, 375, 100, 100);
        scissor1.setVisible(true);

        rock2 = new JLabel(image_rock);
        rock2.setText("Rock");
        rock2.setIcon(image_rock);
        rock2.setBackground(Color.DARK_GRAY);
        rock2.setOpaque(true);
        rock2.setHorizontalTextPosition(JLabel.CENTER);
        rock2.setVerticalTextPosition(JLabel.BOTTOM);
        rock2.setBounds(1050, 75, 100, 100);
        rock2.setVisible(true);

        paper2 = new JLabel(image_paper);
        paper2.setText("Paper");
        paper2.setIcon(image_paper);
        paper2.setBackground(Color.ORANGE);
        paper2.setOpaque(true);
        paper2.setHorizontalTextPosition(JLabel.CENTER);
        paper2.setVerticalTextPosition(JLabel.BOTTOM);
        paper2.setBounds(1050, 225, 100, 100);
        paper2.setVisible(true);

        scissor2 = new JLabel(image_scissor);
        scissor2.setText("Scissors");
        scissor2.setIcon(image_scissor);
        scissor2.setBackground(Color.CYAN);
        scissor2.setOpaque(true);
        scissor2.setHorizontalTextPosition(JLabel.CENTER);
        scissor2.setVerticalTextPosition(JLabel.BOTTOM);
        scissor2.setBounds(1050, 375, 100, 100);
        scissor2.setVisible(true);

        lwait = new JLabel();
        lwait.setText("waiting...");
        lwait.setBackground(Color.RED);
        lwait.setOpaque(true);
        lwait.setHorizontalTextPosition(JLabel.CENTER);
        lwait.setHorizontalAlignment(JLabel.CENTER);
        lwait.setVerticalTextPosition(JLabel.BOTTOM);
        lwait.setBounds(200, 288, 100, 25);
        lwait.setVisible(true);

        rwait = new JLabel();
        rwait.setText("waiting...");
        rwait.setBackground(Color.RED);
        rwait.setOpaque(true);
        rwait.setHorizontalTextPosition(JLabel.CENTER);
        rwait.setHorizontalAlignment(JLabel.CENTER);
        rwait.setVerticalTextPosition(JLabel.BOTTOM);
        rwait.setBounds(900, 288, 100, 25);
        rwait.setVisible(true);
        
        rwinmessage = new JLabel();
        rwinmessage.setText("RED WINS");
        rwinmessage.setBackground(Color.RED);
        rwinmessage.setHorizontalAlignment(JLabel.CENTER);
        rwinmessage.setOpaque(true);
        rwinmessage.setBounds(200, 150, 800, 300);
        rwinmessage.setVisible(false);

        bwinmessage = new JLabel();
        bwinmessage.setText("BLUE WINS");
        bwinmessage.setBackground(Color.BLUE);
        bwinmessage.setHorizontalAlignment(JLabel.CENTER);
        bwinmessage.setOpaque(true);
        bwinmessage.setBounds(200, 150, 800, 300);
        bwinmessage.setVisible(false);

        tiemessage = new JLabel();
        tiemessage.setText("TIE");
        tiemessage.setBackground(Color.GREEN);
        tiemessage.setHorizontalAlignment(JLabel.CENTER);
        tiemessage.setOpaque(true);
        tiemessage.setBounds(200, 150, 800, 300);
        tiemessage.setVisible(false);

        choiceslabel = new JLabel();
        choiceslabel.setText("placehold");
        choiceslabel.setHorizontalAlignment(JLabel.CENTER);
        choiceslabel.setBounds(200, 450, 800, 25);
        choiceslabel.setVisible(false);

        restartlabel = new JLabel();
        restartlabel.setText("hit any key to continue");
        restartlabel.setHorizontalAlignment(JLabel.CENTER);
        restartlabel.setBounds(200, 475, 800, 25);
        restartlabel.setVisible(false);

        redwins = new JLabel();
        redwins.setBounds(-240, 0, 240, 50);
        redwins.setBackground(Color.red);
        redwins.setOpaque(true);

        bluewins = new JLabel();
        bluewins.setBounds(1200, 515, 240, 50);
        bluewins.setBackground(Color.blue);
        bluewins.setOpaque(true);

        this.add(rock1);
        this.add(paper1);
        this.add(scissor1);

        this.add(rock2);
        this.add(paper2);
        this.add(scissor2);

        this.add(lwait);
        this.add(rwait);

        this.add(redwins);
        this.add(bluewins);
       
        this.add(rwinmessage);
        this.add(bwinmessage);
        this.add(tiemessage);

        this.add(choiceslabel);
        this.add(restartlabel);

        this.setLayout(null);
        
        stoopid = 0;
        justwon = false;
        over = false;
        strrock = "Rock";
        strpaper = "Paper";
        strscissor = "Scissors";
        numlwins = 0;
        numrwins = 0;
    }
    public void lockin(){
        if(lready==true && rready ==false){
            lwait.setText("ready!");
            lwait.setBackground(Color.GREEN);
        }
        else if(rready == true && lready == false){
            rwait.setText("ready!");
            rwait.setBackground(Color.GREEN);
        }
        else if(lready == true && rready == true){
            calculate();
            System.out.print("IT WORKED !!!");
        }

    }
    public String getlchoice(){
        return lchoice;
    }
    public String getrchoice(){
        return rchoice;
    }
        

    public void calculate(){
        if(lchoice.equals(strrock) && rchoice.equals(strpaper)){
            //right win
            bwin();
            rock1.setVisible(true);
            paper2.setVisible(true);

        }
        else if(lchoice.equals(strrock) && rchoice.equals(strscissor)){
            //left win
            rwin();
            rock1.setVisible(true);
            scissor2.setVisible(true);
            
        }
        else if(lchoice.equals(strpaper) && rchoice.equals(strrock)){
            //left win
            rwin();
            paper1.setVisible(true);
            rock2.setVisible(true);

        }
        else if(lchoice.equals(strpaper) && rchoice.equals(strscissor)){
            //right win
            bwin();
            paper1.setVisible(true);
            scissor2.setVisible(true);
            
        }
        else if(lchoice.equals(strscissor) && rchoice.equals(strrock)){
            //right win
            bwin();
            scissor1.setVisible(true);
            rock2.setVisible(true);
        }
        else if(lchoice.equals(strscissor) && rchoice.equals(strpaper)){
            //left win
            rwin();
            scissor1.setVisible(true);
            paper2.setVisible(true);
        }
        else if(lchoice.equals(rchoice)){
            //tie
            tie();
            if(lchoice.equals(strrock)){
                rock1.setVisible(true);
                rock2.setVisible(true);
            }
            else if(lchoice.equals(strpaper)){
                paper1.setVisible(true);
                paper2.setVisible(true);

            }
            else if(lchoice.equals(strscissor)){
                scissor1.setVisible(true);
                scissor2.setVisible(true);
            }
        }
        choiceslabel.setText("Red chose:"+getlchoice()+" & Blue chose:"+getrchoice());
        choiceslabel.setVisible(true);
        restartlabel.setVisible(true);
    }
    public void rwin(){
        justwon = true;
        numlwins++;
        if(numlwins == 5){
            over = true;
            restartlabel.setText("GAME OVER!!!   RED WAS FIRST TO 5!!!");
        }
        redwins.setSize(redwins.getWidth()+240, 50);
        rwinmessage.setVisible(true);
        rock1.setVisible(false);
        rock2.setVisible(false);
        paper1.setVisible(false);
        paper2.setVisible(false);
        scissor1.setVisible(false);
        scissor2.setVisible(false);
        lwait.setVisible(false);
        rwait.setVisible(false);

        
    }
    public void bwin(){
        justwon = true;
        numrwins++;
        if(numrwins == 5){
            over = true;
            restartlabel.setText("GAME OVER!!!   BLUE WAS FIRST TO 5!!!");
        }
        bwinmessage.setVisible(true);
        rock1.setVisible(false);
        rock2.setVisible(false);
        paper1.setVisible(false);
        paper2.setVisible(false);
        scissor1.setVisible(false);
        scissor2.setVisible(false);
        lwait.setVisible(false);
        rwait.setVisible(false);
        bluewins.setBounds(bluewins.getX()-240, 515, bluewins.getWidth()+240, 50);
    }
    public void tie(){
        justwon = true;
        tiemessage.setVisible(true);
        rock1.setVisible(false);
        rock2.setVisible(false);
        paper1.setVisible(false);
        paper2.setVisible(false);
        scissor1.setVisible(false);
        scissor2.setVisible(false);
        lwait.setVisible(false);
        rwait.setVisible(false);
    }
    public void reset(){
        rock1.setVisible(true);
        rock2.setVisible(true);
        paper1.setVisible(true);
        paper2.setVisible(true);
        scissor1.setVisible(true);
        scissor2.setVisible(true);
        rwait.setText("waiting...");
        rwait.setBackground(Color.RED);
        lwait.setText("waiting...");
        lwait.setBackground(Color.RED);
        lwait.setVisible(true);
        rwait.setVisible(true);
        choiceslabel.setVisible(false);
        restartlabel.setVisible(false);
        rwinmessage.setVisible(false);
        bwinmessage.setVisible(false);
        tiemessage.setVisible(false);

        justwon = false;
        lready = false;
        rready = false;
        lchoice = null;
        rchoice = null;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        if(over == false){
            if(justwon == false){
                if(lready == false && rready == false){
                    //left side
                    if(e.getKeyCode() == 83){
                        lchoice = "Scissors";
                        lready = true;
                    }
                    else if(e.getKeyCode() == 68){
                        lchoice = "Paper";
                        lready = true;
                    }
                    else if(e.getKeyCode() == 70){
                        lchoice = "Rock";
                        lready = true;
                    }
                    //right side 
                    else if(e.getKeyCode() == 74){
                        rchoice = "Rock";
                        rready = true;
                    }
                    else if(e.getKeyCode() == 75){
                        rchoice = "Paper";
                        rready = true;
                    }
                    else if(e.getKeyCode() == 76){
                        rchoice = "Scissors";
                        rready = true;
                    }
                    lockin();
                }
                else if(rready==true){
                    if(e.getKeyCode() == 83){
                        lchoice = "Scissors";
                        lready = true;
                    }
                    else if(e.getKeyCode() == 68){
                        lchoice = "Paper";
                        lready = true;
                    }
                    else if(e.getKeyCode() == 70){
                        lchoice = "Rock";
                        lready = true;
                    }
                    lockin();
                }
                else if(lready == true){
                    if(e.getKeyCode() == 74){
                        rchoice = "Rock";
                        rready = true;
                    }
                    else if(e.getKeyCode() == 75){
                        rchoice = "Paper";
                        rready = true;
                    }
                    else if(e.getKeyCode() == 76){
                        rchoice = "Scissors";
                        rready = true;
                    }
                    lockin();
                }

            }
            else if(justwon == true){
                stoopid = e.getKeyCode();
                int placeholder = stoopid;
                if(stoopid == placeholder){
                    reset();
                }

            }

        }
        //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}