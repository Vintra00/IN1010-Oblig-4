abstract class Legemidell{      //Kan ikke lages direkte, kun gjennom subklasser

    protected String navn;              
    private static int IdT;         // lager static ID teller 
    protected int Id;               // dette er Id en som blir gitt til legemiddlene
    protected int pris;
    protected double virkestoff;

    public Legemidell(String navn, int pris, double virkestoff){    // Konstruktør
        this.navn = navn;                                           // definerer String navn
        this.pris = pris;                                           // definerer int Pris
        this.virkestoff = virkestoff;                               // definerer double virkestoff
        IdT++;                      // Plusser 1 hver gang ett legemiddel blir laget. Altså en av subklassene
        Id = IdT;                   // referanse til static
        
    }

    public int hentId(){       // metode for å hente Id en , den som blir delt ut.
        return Id;
    }

    public String hentNavn(){       // Henter String Navn
        return navn;
    }

    public int hentPris(){          // Henter int Pris
        return pris;
    }

    public double hentVirkestoff(){     // Henter double virkestoff
        return virkestoff;
    }

    public void settNyPris(int nyPris){     // Setter nypris på produktet
        pris = nyPris;
    }

    public String toString(){   // toString metode som blir skrevet om.
        return ("Navn: " + navn +"\nPris: " + pris + "\nVirkestoff: " + virkestoff);
    }
}