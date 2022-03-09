public class Narkotisk extends Legemidell {
    
    private int styrke;                 
    private int Id = this.hentId();     // Bruker hentId metode for å "sette" iden som er tildelt

    public Narkotisk(String navn, int pris, double virkestoff, int styrke){     // Konstruktør
        super(navn, pris, virkestoff);         
        this.styrke = styrke;                  // definerer int styrke
    }

    public int hentNarkotiskStyrke(){           // Metode for å hente styrken
        return styrke;
    }
    @Override                                   // Overider metoden fra Legemiddel
    public String toString(){                   // Skriver om toString metoden
        return ("Navn: " + navn +"\nPris: " + pris + "\nVirkestoff: " + virkestoff
        + "\nStyrke: " + styrke + "mg" + "\nReseptID: " + Id);

    }
}
