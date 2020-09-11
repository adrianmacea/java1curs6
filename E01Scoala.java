/**
 * clasa Elev cu atributele nume, prenume, cnp
 * 
 * clasa Clasa care trebuie sa aiba maxim 20 elevi,
 * trebuie sa-i definim metodele:
 *  - adaugaElev(Elev e) - care adauga un elev ca parametru trimis in clasa
 *  - elimina elev(String cnp) - care scoate elev din clsa dupa cnp
 *  - afiseazaElevi()
 *  - ordoneazaElevi()
 *  
 * clasa Main
 *  - adauga <nume> <prenume> <cnp>
 *  - elimina <cnp>
 *  - afiseaza
 *  - ordoneaza
 *  - salvare <fis>
 *  - deschidere <fis>
 */

import java.io.*;

public class E01Scoala{
    static Clasa clasa = new Clasa();
    static BufferedReader cons;
    static ObjectOutputStream oos;
    static ObjectInputStream ois;
    
    public static void main(String [] args){
        try{
            cons = new BufferedReader(new InputStreamReader(System.in));
            String comanda = "";
            
            while(true){
                System.out.print("Comanda ");
                comanda = cons.readLine();
                String [] v = comanda.split("\\s+");
                
                if(v[0].equalsIgnoreCase("exit")){
                    System.out.println("Se inchide...");
                    System.exit(0);
                }
                
                if(v[0].equalsIgnoreCase("adauga")){
                    try{
                        clasa.adaugaElev(new Elev(v[1], v[2], v[3]));
                        System.out.println("Elev adaugat");
                    }catch(PreaMultiEleviException e){
                        System.out.println(e);
                    }
                }
                
                if(v[0].equalsIgnoreCase("elimina")){
                    clasa.eliminaElev(v[1]);
                    System.out.println("Elev eliminat din clasa");
                }
                
                if(v[0].equalsIgnoreCase("afiseaza")){
                    System.out.println("Elevi: ");
                    System.out.println("==============================");
                    clasa.afiseazaElevi();
                    System.out.println("==============================");
                }
                
                if(v[0].equalsIgnoreCase("ordoneaza")){
                    clasa.ordoneazaElevi();
                    System.out.println("==============================");
                    clasa.afiseazaElevi();
                    System.out.println("==============================");                    
                }
                
                if(v[0].equalsIgnoreCase("salvare")){
                    oos = new ObjectOutputStream(new FileOutputStream(v[1]));
                    oos.writeObject(clasa);
                    oos.close();
                    System.out.println("Salvare efectuata.");
                }
                
                if(v[0].equalsIgnoreCase("deschide")){
                    ois = new ObjectInputStream(new FileInputStream(v[1]));
                    clasa = (Clasa) ois.readObject();
                    ois.close();
                    System.out.println("Deschidere efectuata.");
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}