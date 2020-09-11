import java.awt.*;
import java.awt.event.*;

public class E02AWT extends Panel{    
    // java.awt.Panel is the simplest container class
    
    public static void main(String[] args){
        Frame f = new Frame(); // echivalentul brawserului ... suportul
        f.setVisible(true);
        f.setSize(800,600);
        f.add(new E02AWT()); // aici e panelul care este echiv. appletului ???
    }
    
    //java.awt.Panel mosteneste pe java.awt.Container care mosteneste pe java.awt.Component
    //java.awt.Component are comportamntul paint care este mostenit apoi de clasele Container si Panel
    //suprascriu metoda pentru desen paint care primeste ca parametru o instanta a clasei java.awt.Graphics ???
    //de revazut metoda paint mai in profunzime
    //apoi folosesc diferite metode din clasa Graphics pentru a desena diverse forme
    public void paint(Graphics g){        
        g.drawString("Hello",20,20); //scrie textul cu originea la coordonatele date
        g.drawLine(20,30,200,300); //deseneaza un segment intre doua puncte cu coordonatele date
        g.setColor(Color.RED); //am schimbat culoarea
        g.drawRect(30,30,300,100); //coordonatele originii stanga sus, plus dimensiune latime si inaltime
        g.setColor(Color.YELLOW); //am schimbat culoarea
        g.fillRect(70,70,400,200); //dreptunghiul are fill
        g.setColor(new Color(0,0,255,50)); //am schimbat culoarea + transparenta
        g.fillOval(410,20,100,100); //elipsa incadrata de dreptunghiul cu parametrii dati + fill
    }
    
    //TEMA: de folosit cat mai multe metode din clasele Graphics si Graphics2D
    //conversia Graphics-Graphics2D se face f simplu, conversie explicita, apoi apelam comportamentele din Graphics2D

}