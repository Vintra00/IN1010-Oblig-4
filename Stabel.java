public class Stabel<T> extends Lenkeliste<T> {
    
    @Override
    public void leggTil(T input){       // Overrider for å sette ting øverst
        int stoerrelse = 0;             // velger lokal variabel ovenfor stoerrelse()
        if (forste == null){            
            forste = new Node(input);
        }else{
            Node skalBliAddet = new Node(input);  // ny Node
            Node tmp = forste;                       // midlertidig
            forste = skalBliAddet;                      // setter ny Node til forste
            skalBliAddet.neste = tmp;                   // setter gammle forste til neste
        }
        stoerrelse++;                                   // øker stoerrelse
        }
    }

