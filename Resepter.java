abstract class Resepter {           //abstract

    private static int IdT;         // lager static ID teller
    protected int Id;               // dette er Id en som blir gitt til reseptene
    protected Legemidell legemiddel;        // Legemiddel objekt
    protected Lege utskrivendeLege;         // Lege objekt
    protected int pasientId;
    protected int reit;

    public Resepter(Legemidell legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        IdT++;
        Id = IdT;

    }

    public int hentId(){        // metode for å hente iD
        return Id;
    }

    public Legemidell hentLegemiddel(){     // metode for å hente legemiddel
        return legemiddel;
    }

    public Lege hentLege(){                 // metode for å hente Lege
        return utskrivendeLege;
    }
    
    public int pasientId(){                 // metode for å hente pasient ID
        return pasientId;
    }

    public int hentReit(){                  // metode for å hente reit
        return reit;
    }

    public boolean bruk(){                  // metode for å bruke opp en reit, eller returne false om alt er brukt
        if (reit != 0){
            reit--;
            return true;
        }
        return false;
    }

    abstract public String farge();         // Lager abstract metode
    abstract public int prisAaBetale();     // Lager abstract metode





    
}
