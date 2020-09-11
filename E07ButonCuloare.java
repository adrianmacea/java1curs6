import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class E07ButonCuloare extends JFrame{
    
    Random r = new Random();
            
    public static void main(String[] args){
        new E07ButonCuloare();        
    }
    
    E07ButonCuloare(){
        super("myFrame");
        setVisible(true);
        setSize(800,600);
        setLayout(null);
        JButton b = new JButton("TEST THE RAINBOW");
        b.setBounds(300,80,200,60);
        this.add(b);
            b.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        int red = r.nextInt(256);
                        int green = r.nextInt(256);
                        int blue = r.nextInt(256);
                        b.setLabel("R"+red+" "+"G"+green+" "+"B"+blue);
                        b.setOpaque(true);
                        b.setBackground(new Color(red,green,blue));
                    }
                }
            );
          
        }
    
    
}
