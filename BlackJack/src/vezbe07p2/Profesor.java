
package vezbe07p2;


public class Profesor extends Osoba{ 
    
    
    private float plata;  
    private String brojKnjizice; 

    public Profesor(float plata, String brojKnjizice, String ime, String prezime, String jmbg) {
        super(ime, prezime, jmbg);
        this.plata = plata;
        this.brojKnjizice = brojKnjizice;
    }

    public float getPlata() {
        return plata;
    }

    public void setPlata(float plata) {
        this.plata = plata;
    }

    public String getBrojKnjizice() {
        return brojKnjizice;
    }

    public void setBrojKnjizice(String brojKnjizice) {
        this.brojKnjizice = brojKnjizice;
    }
    
    

    
    
    
    
}
