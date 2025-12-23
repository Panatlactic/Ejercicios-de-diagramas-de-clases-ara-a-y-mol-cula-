package araña_pk.Cefalotorax_partes;

import araña_pk.Cefalotorax_partes.Cabeza_pk.Cabeza;
import araña_pk.Cefalotorax_partes.Torax_pk.Torax;

public class Cefalotorax {

    public Cabeza cabeza;
    public Torax torax;
    
    public Cefalotorax() {
        this.cabeza = new Cabeza();
        this.torax = new Torax();
    }
    
}
