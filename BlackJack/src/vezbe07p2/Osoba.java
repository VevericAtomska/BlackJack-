
package vezbe07p2;


public class Osoba { 
    
    private String ime, prezime, jmbg; 
    
    // Set metode
    public void setIme (String ime) {this.ime = ime;}  
    public void setPrezime (String prezime) {this.prezime = prezime;} 
    public void setJmbg (String jmbg) {this.jmbg = jmbg;} 
    
    public String getIme() {return this.ime;} 
    public String getPrezime() {return this.prezime;} 
    public String getJmbg() {return this.jmbg;}

    public Osoba(String ime, String prezime, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
    }
    
    
    
    
}
