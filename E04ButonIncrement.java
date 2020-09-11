import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E04ButonIncrement extends JFrame implements ActionListener{
    JButton b = new JButton("0");
    int i = 0;
            
    public static void main(String[] args){
        new E04ButonIncrement();        
    }
    
    E04ButonIncrement(){
        super("myFrame");
        setVisible(true);
        setSize(800,600);
        setLayout(null);
        b.setBounds(80,80,200,60);
        this.add(b);
            b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ev){
        i++;
        b.setLabel(i+""); //exchivalent cu b.setLabel(Integer.toString(i));
    }
}
