public class Clasa implements java.io.Serializable{ 
    //trebuie sa facem si clasa serializabila 
    
    Elev [] elevi = new Elev[20];
    int n;
    
    public void adaugaElev(Elev e) throws PreaMultiEleviException{
        if(n<20){
            elevi[n] = e;
            n++;
        }else throw new PreaMultiEleviException();
    }
    
    public void eliminaElev(String cnp){
        for(int i=0;i<n;i++)
            if(elevi[i].getCNP().equals(cnp)){
                for(int j=i;j<n-1;j++)
                    elevi[j]=elevi[j+1];
                    
                elevi[n-1] = null;
                System.gc();
                n--;
            }
    }
    
    public void afiseazaElevi(){
        for(int i=0;i<n;i++)
            System.out.println(elevi[i]);
    }
    
    public void ordoneazaElevi(){
        Elev aux;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(elevi[i].getNume().compareTo(elevi[j].getNume())>0){
                    aux = elevi[i];
                    elevi[i] = elevi[j];
                    elevi[j] = aux;
                }
            
    }
}