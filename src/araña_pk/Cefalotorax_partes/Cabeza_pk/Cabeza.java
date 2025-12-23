package araña_pk.Cefalotorax_partes.Cabeza_pk;

public class Cabeza {
    
    public Ojo ojos[] = new Ojo[8];
    public Colmillo comillos[] = new Colmillo[2];

    public Cabeza(){
        for (int i = 0; i < ojos.length; i++) {
            ojos[i] = new Ojo();
        }

        for (int i = 0; i < comillos.length; i++) {
            comillos[i] = new Colmillo();
        }
    }
}
