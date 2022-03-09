public class Vanedannende extends Legemidell {
    
    private int styrke;                
    private int Id = this.hentId();         // Bruker hentId metode for å "sette" iden som er tildelt

    public Vanedannende(String navn, int pris, double virkestoff, int styrke){      // Konstruktør
        super(navn, pris, virkestoff);
        this.styrke = styrke;           // definerer int styrke
    }

    public int hentVanedannendeStyrke(){        // metode for å hente styrke
        return styrke;
    }
    @Override                                   // Overider metoden fra Legemiddel
    public String toString(){                   // Skriver om toString metoden
        return ("Navn: " + navn +"\nPris: " + pris + "\nVirkestoff: " + virkestoff
        + "\nStyrke: " + styrke + "mg" + "\nResept ID: " + Id);

    }
    
}
