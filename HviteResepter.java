public class HviteResepter extends Resepter {

    public int pris;                        // int pris
    private int Id = this.hentId();         // henter id

    public HviteResepter(Legemidell legemiddel, Lege utskrivendeLege, int pasientId, int reit){     // Konstruktør
        super(legemiddel, utskrivendeLege, pasientId, reit);        // sender opp

    }
    
    public String farge(){              // definerer farge metode
        return ("Hvite resepter");
    }
    public int prisAaBetale(){          // definerer prisaabetale metode
        return pris;
        
    }

    public int settPris(){              // lager for å bruke i mil og pre
        return pris;
    }

    public String toString(){
        return ("Type: " + this.farge() + "\nPris med Hvit resept: "+ pris + "\n" + legemiddel + "\n" + utskrivendeLege + "\nPasientID: " + pasientId + "\nReit igjen: " + reit + "\nResept ID: " + Id);
    }
}
