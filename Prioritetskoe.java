public class Prioritetskoe<T extends Comparable<T>> extends Lenkeliste<T> {
    
    @Override
    public void leggTil(T input){
        Node tmp = forste;
        Node ny = new Node(input);

        if (tmp == null){           // om det er tomt
            super.leggTil(input);
            return;
        }else if(stoerrelse() == 1){            // om det kun er 1 Node fra før
            if(hent().compareTo(input) < 0){    // Comparer om det er negativt tal. Om ja så setter vi bak
                super.leggTil(input);
                return;
            }else{
                ny.neste = tmp;                 // ellers foran
                forste = ny;
                return;
            }
        }
        int teller = 0;
        while (tmp != null) {
            if(tmp.data.compareTo(input) > 0){      // iterer til Node så sjekke om det er positivit
                leggTil(teller, input);             // om ja så setter vi det foran gitt Node
                return;
            }
        tmp = tmp.neste;
        teller ++;
        }
        super.leggTil(input);                       // hvis ikke er det totalt størst
    }


    public void leggTil(int pos, T x) throws UgyldigListeindeks {       // kopi fra Indeksert
        if (pos < 0 || pos >= stoerrelse() + 1){
            throw new UgyldigListeindeks(pos);
        }
        Node ny = new Node(x);
        ny.neste = null;
        Node naa = forste;
        Node forrige = null;
        if (pos == 0 && forste == null) {
            forste = ny;
            return;
            
        }else if (pos == 0 && forste != null) {
            ny.neste = forste;
            forste = ny;
            return;
        }
        int teller = 0;

        while (teller < pos) {
            forrige = naa;
            naa = naa.neste;
            if (naa == null){
                break;
            }
            teller++;
        }
        ny.neste = naa;
        forrige.neste = ny;
        
    }
}
