public class Presepter extends HviteResepter {

    private static int rabatt = 108;       // int med rabatt
    private int pris = this.prisAaBetale();     // setter prisen
        

    public Presepter(Legemidell legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
    
    }


    @Override
    public int prisAaBetale(){
        pris = (legemiddel.hentPris() - rabatt);    // henter prisen og tar minus rabatten
        if (pris > 0){                              // hvis prisen er større enn 0 return det
            return pris;
        }
        else{                                       // ellers får de gratis
            return pris= 0;
        }   
    }

    @Override
    public String toString(){
        return (legemiddel + "\n" + utskrivendeLege + "\nPasientID: " + pasientId + "\nReit igjen: " + reit + "\nPris: " + pris);
    }
}
/* 
    public int settPris(){                      // Det prisaaBetale skal være
        pris = (legemiddel.hentPris() - rabatt);    // henter prisen og tar minus rabatten
        if (pris > 0){                              // hvis prisen er større enn 0 return det
            return pris;
        }
        else{                                       // ellers får de gratis
            return pris= 0;
        }    
    }
 */