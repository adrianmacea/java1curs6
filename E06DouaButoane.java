/**
 * Avem doua butoane. Cum le facem sa functioneze independent?
 * 
 * METODA 2:
 * Folosim doi observatori. 
 * Folosim tipuri imbricate (Nested/Inner Anonymous Types) pentru a crea instante diferite ale clasei de tip interface.
 * 
 * Deci avem un observator diferit pentru fiecare componenta.
 * Aceasta metoda este mai des folosita decat varianta anterioara, dar ambele sunt importante.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E06DouaButoane extends JFrame{
    JButton b1 = new JButton("0");
    JButton b2 = new JButton("0");
    int i,j; 
                
    public static void main(String[] args){
        new E06DouaButoane();        
    }
    
    E06DouaButoane(){
        super("myFrame");
        setVisible(true);
        setSize(800,600);
        setLayout(null);
        b1.setBounds(40,80,200,60);
        b2.setBounds(280,80,200,60);
        
        this.add(b1);
            b1.addActionListener(
                new ActionListener(){//am creat un Listener nou, dar o interfata nu poate sa creeze instante, decat daca
                    public void actionPerformed(ActionEvent ev){//folosim Inner Anonymous Type si suprascriem metodele abstracte
                        i++;
                        b1.setLabel(i+"");
                    }
                }
            );
            
        this.add(b2);
            b2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        j++;
                        b2.setLabel(j+"");
                    }
                }
            );
            
    }
    
}
