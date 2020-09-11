public class Elev implements java.io.Serializable{ //clasa elev serializabila, deci instanta ei se poate trimite prin flux
    private String nume, prenume, cnp; 
    //toate atributele sunt private, am facut incapsularea completa a clasei prin comportamentele getter si setter de mai jos
    
    //constructorul ne obliga sa dam valoare parametrilor la instantiere
    public Elev(String nume, String prenume, String cnp){
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    
    public void setCNP(String cnp){
        this.cnp = cnp;
    }
    
    public String getNume(){
        return this.nume;
    }
    
    public String getPreume(){
        return this.prenume;
    }
    
    public String getCNP(){
        return this.cnp;
    }
    
    //am suprascris metoda toString a clasei java.lang.Object, returneaza ca sir de caractere instanta de elev 
    public String toString(){
        return nume+" "+prenume+" "+cnp;
    }
}