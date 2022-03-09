abstract class Lenkeliste <T> implements Liste<T> {

    protected Node forste;   // Forste
   // protected int stoerrelse = 0;

    public class Node{
        Node neste = null;       // referanse til neste Node
        Node forrige = null;     // referanse til forrige Node
        T data = null;              // Innholdet
        public Node(T data){
            this.data = data;
        }
        @Override
        public String toString(){       // toString metode for å kunne skrive ut innhold
            return ("Data: " + data.toString());
        }

        // lagde de neste metodene i tilfelle

        public void settNeste(Node x){   // metode for å sette neste
            neste = x;
            neste.settForrige(this); 
        }
        public void settForrige(Node x){
            this.forrige = x;
        }
        public Node hentNeste(){
            return neste;
        }
        public Node hentForrige(){
            return forrige;
        }
        public boolean harNeste(){  // skal sjekke neste, men har ikke implementer Iterator så
            if(this.neste != null){
                return true;
            }else{return false;}
        }
    }
    

    @Override   
    public void leggTil(T input){       // legge til i Koe stil
        // om listen er tom
        if (forste == null){            
            forste = new Node(input);
        }else{  
            Node skalBliAddet = new Node(input);  // lager ny Node
            Node tmp = forste;                       // midlertidig Node
            while (tmp.hentNeste() != null) {           // iterer
                tmp = tmp.hentNeste();                  // henter neste Node
            }
            tmp.settNeste(skalBliAddet);                // setter nye Node etter sist iterert
            skalBliAddet.settForrige(tmp);              // setter forrige
        }
        //stoerrelse++;
    }

    @Override
    public T hent(){        // henter data fra forste
        Node tmp = forste;
        return tmp.data;
    }

    @Override
    public int stoerrelse(){    // henter "lengde"
        Node tmp = forste;
        int stoerrelse = 0;     // teller
        if (tmp == null) {      // om den er tom
            return stoerrelse;
        }  
        while (tmp != null) {       // iterer og teller
            stoerrelse ++;
            tmp = tmp.neste;
        }
        return stoerrelse;
    }

    @Override
    public T fjern() throws UgyldigListeindeks{ // henter og fjerner forstedata
        if (forste == null){
            throw new UgyldigListeindeks(0);    // trouble
        }
        T retur = forste.data;                  // midlertidig
        if (forste.neste != null) {             // iterer
            forste = forste.neste;              // setter neste, vet ikke om denne egentlig funker optimalt
            return retur;                       // return  
        }else{
            forste = null;
            return retur;
        }


    }
    @Override
    public String toString(){       // toString for å skrive ut
        String skriv = "";          // tom String
        Node x = forste;         // midlertdig
        while (x != null) {         // iterere
            skriv += x.toString() + "\n" ;      // adder tostring fra Node klassen
            x = x.neste;
        }
        return skriv;
    }


    
}
