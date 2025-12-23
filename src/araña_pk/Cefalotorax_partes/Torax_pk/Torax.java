package araña_pk.Cefalotorax_partes.Torax_pk;

public class Torax {
    
    public Pata patas[] = new Pata[8];

    public Torax() {
        for (int i = 0; i < patas.length; i++) {
            patas[i] = new Pata();
        }
    }

    public boolean moverPatas (){
        for (Pata p : patas){
            p.mover();
        }
        return true;
    }

}
