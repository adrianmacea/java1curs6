import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E03ButonSwing extends JFrame implements ActionListener{
    JButton b = new JButton("Click!"); // creat instanta buton, pus in zona de memorie b
    
    public static void main(String[] args){
        new E03ButonSwing();        
    }
    
    E03ButonSwing(){
        super("myFrame"); //constructorul clasei JFrame 
        setVisible(true); //comportament al JFrame (trebuie suprascris pt ca default e fals)
        setSize(800,600); //comportament al JFrame
        setLayout(null); //comportament al JFrame (default e BorderLayout - adica componenta ia dimensiunea ferestrei)
        b.setBounds(20,20,200,60); //am dat coordonatele si deimensiunea butonului
        this.add(b); 
        //add este comportament al JFrame, adauga componenta "b" pe "this" adica pe container, adica pe instanta "new E02ButonSwing()"
            b.setBackground(Color.BLUE);
            b.setForeground(Color.RED);
            //apelez metoda addActionListener din JButton, care adauga observator pentru buton
            //observatorul este acelasi this d emai sus, cand se produce eveniment pe buton (apasare), this va fi notificat
            b.addActionListener(this); 
    }
    
    //suprascriu metoda actionPerformed a interfetei ActionListener unde spun observatorului this ce sa faca cand este notificat
    //actionPerfeormed foloseste java.awt.event.ActionEvent ...
    public void actionPerformed(ActionEvent ev){
        if(b.getLabel().equals("Click!")){
            b.setLabel("Again!");
        }else{
            b.setLabel("Click!");
        }
    }
}
