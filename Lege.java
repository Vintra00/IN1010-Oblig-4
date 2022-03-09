public class Lege {
    
    String navn;        // string

    public Lege(String navn){       // konstruktør
        this.navn = navn;       
    }

    public String hentNavn(){       // metode til å hente navn
        return navn;
    }

    public String toString(){       // skriver om toString
        return ("Lege navn: " + navn);
    }
}
