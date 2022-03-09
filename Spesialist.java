public class Spesialist extends Lege implements Godkjenningsfritak {

    String kontrollID;                      // String

    public Spesialist(String navn, String kontrollID){      // konstruktør
        super(navn);                                        // sender opp
        this.kontrollID = kontrollID;
    }
    @Override
    public String hentKontrollID(){                         // metode fra interface for å hente kontrollId
        return kontrollID;
    }
    @Override
    public String toString(){
        return ("Lege navn: " + navn + "\nKontrollId: " + kontrollID);
    }

}
