public class BlaResepter extends Resepter {

    private int pris = (int) Math.round(legemiddel.hentPris() * 0.25);  // henter pris og gir rabatt pris med nærmeste heltall
    private int Id = this.hentId();                                     // henter id

    public BlaResepter(Legemidell legemiddel, Lege utskrivendeLege, int pasientId, int reit){   //konstruktør
        super(legemiddel, utskrivendeLege, pasientId, reit);                                    // super sender oppover
    }
    
    public String farge(){      // definerer farge metode
        return ("Blå resept");
    }
    public int prisAaBetale(){  // definerer prisaabetale metode
        return pris;
    }
    @Override
    public String toString(){
        return ("Type: " + this.farge() +"\nPris med Blåresept: " + pris + "\n" + legemiddel + "\n" + utskrivendeLege + "\nPasientID: " + pasientId + "\nReit igjen: " + reit + "\nResept ID: " + Id);
    }
}
