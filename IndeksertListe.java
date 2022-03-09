public class IndeksertListe<T> extends Lenkeliste<T> {

    
    public void leggTil(int pos, T x) throws UgyldigListeindeks {  // legge til på en gitt posisjon
        if (pos < 0 || pos >= stoerrelse() + 1){                   // sjekker om det er ugyldig posisjon, legger til +1 på stoerrelse for å ikke få feil throw
            throw new UgyldigListeindeks(pos);
        }
        Node ny = new Node(x);            // nye Node
        ny.neste = null;                        // setter neste til nye til null
        Node naa = forste;                   // midlertidig
        Node forrige = null;                 // for å ta vare på forrige
        if (pos == 0 && forste == null) {       // om det er tomt
            forste = ny;
            return;
            
        }else if (pos == 0 && forste != null) {     // om det skal på første posisjon
            ny.neste = forste;
            forste = ny;
            return;                                 // For å ikke kjøre siste av metoden
        }
        int teller = 0;                             // teller

        while (teller < pos) {                      // om det er lengre inn i "lista"
            forrige = naa;                          // forrige blir satt
            naa = naa.neste;                        // henter neste
            if (naa == null){                       // om vi kommer til slutt break
                break;
            }
            teller++;
        }
        ny.neste = naa;                             // setter nåværende Node til neste
        forrige.neste = ny;                         // setter forrige elemnent sin neste til nye
        
    }
    

    
    public void sett(int pos, T x){
        Node node = forste;                          // midlertidig, Her skjønnte jeg at Node burde bli kalt Node -_-
        if (pos < 0 || pos >= stoerrelse()){            // kaster om 
            throw new UgyldigListeindeks(pos);
        }else if (pos == 0 && node != null){            // Om det skal bytte data på forste
            node.data = x;
        }
        int teller = 0;
        while (node != null) {          // iterer til riktig Node
            if (teller == pos){         // når du kommer til riktig Elemet
                node.data = x;          // bytter data
                
            }
            node = node.neste;
            teller ++;
        }
    }

    public T hent(int pos){
        Node taUt = null;
        if (pos < 0 || pos >= stoerrelse()){
            throw new UgyldigListeindeks(pos);
        }else{
            int teller = 0;
            Node node = forste;
            while (node != null) {
                if (teller == pos){
                    taUt = node;
                }
                node = node.neste;
                teller ++;
            }
        }
        return taUt.data;
    }

   public T fjern (int pos) throws UgyldigListeindeks{
    if (pos < 0 || pos >= stoerrelse()){    // vil egentlig ikke ha med >= men test 6 går kun med
        throw new UgyldigListeindeks(pos);
    }
    if (stoerrelse() == 1){         // om det kun er 1 så henter jeg data og fjerner
        Node eneste = null;
        eneste = forste;
        forste = null;
        return eneste.data;
        }else{

        Node tmp = forste;
        Node taUt = null;
        for (int i = 0; tmp != null && i < pos - 1; i++) {          // iterer til noden før
            tmp = tmp.neste;
        }
        taUt = tmp.neste;                                           // setter inn nye Nodeet til å være neste til den som skal bli lenket av
        tmp.neste = tmp.neste.neste;                                // setter den neste til neste.neste for å hoppe over
        return taUt.data;                                           
        
        }
    
 }
}
