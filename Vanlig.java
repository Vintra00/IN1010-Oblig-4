public class Vanlig extends Legemidell {

    private int Id = (this.hentId());       // Bruker hentId metode for å "sette" iden som er tildelt
    
    public Vanlig(String navn, int pris, double virkestoff){    //Konstruktør
        super(navn, pris, virkestoff);  
    
    }
    @Override                       // Overider metoden fra Legemiddel
    public String toString(){       // Skriver om toString metoden
        return ("Navn: " + navn +"\nPris: " + pris + "\nVirkestoff: " + virkestoff + "\nResept ID: " + Id);
    }
}
