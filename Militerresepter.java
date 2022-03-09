public class Militerresepter extends HviteResepter {
    
    private int pris = this.prisAaBetale(); /////////// sjekk prisen
    public Militerresepter(Legemidell legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit = 3);
    }

    
    @Override
    public int prisAaBetale(){
        return pris = 0;
    }
    @Override
    public String toString(){
        return (legemiddel + "\n" + utskrivendeLege + "\nPasientID: " + pasientId + "\nReit igjen: " + reit + "\nPris: " + pris);
    }

    
}
