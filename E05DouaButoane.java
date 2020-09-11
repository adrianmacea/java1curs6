/**
 * Avem doua butoane. Cum le facem sa functioneze independent?
 * 
 * METODA 1:
 * Folosim un singur observator. 
 * Si apelam metoda getSource a clasei ActionEvent pentru a afla care buton a suferit evenimentul. * 
 * 
 * Deci avem un singur observator pentru mai multe componente.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E05DouaButoane extends JFrame implements ActionListener{
    JButton b1 = new JButton("0");
    JButton b2 = new JButton("0");
    int i,j; //default au valoare 0
                
    public static void main(String[] args){
        new E05DouaButoane();        
    }
    
    E05DouaButoane(){
        super("myFrame");
        setVisible(true);
        setSize(800,600);
        setLayout(null);
        b1.setBounds(40,80,200,60);
        b2.setBounds(280,80,200,60);
        this.add(b1);
            b1.addActionListener(this);
        this.add(b2);
            b2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ev){
        JButton bx = (JButton) ev.getSource();
        //getSource este un comportament mostenit al lui ActionEvent care ne spune exact care componenta a suferit eventul
        if(bx==b1){
            i++;
            b1.setLabel(i+"");
        }else{
            j++;
            b2.setLabel(j+"");
        }        
    }
}
