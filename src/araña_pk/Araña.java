package araña_pk;

import araña_pk.Abdomen_partes.Abdomen;
import araña_pk.Cefalotorax_partes.Cefalotorax;
import araña_pk.Cefalotorax_partes.Cabeza_pk.Colmillo;

public class Araña {

    private boolean haMordido;
    public Cefalotorax cefalotorax;
    public Abdomen abdomen;


    public boolean isHaMordido() {
        return haMordido;
    }
    public void setHaMordido(boolean haMordido) {
        this.haMordido = haMordido;
    }

    public Araña (){
        this.cefalotorax = new Cefalotorax();
        this.abdomen = new Abdomen();
        setHaMordido(false);
    }

    public boolean morder (){

        if (!haMordido){
            System.out.println("La araña ha mordido a alguien!!!");
            for (Colmillo c : cefalotorax.cabeza.comillos){
                c.inyectarVeneno();
            }

            setHaMordido(true);
            return true;

        } else {
            System.out.println("La araña esta mordiendo algo ahora....");
            return false;
        }

    }

    public void dejarDeMorder (){
        setHaMordido(false);
    }
    
    public String crearTelaraña (){

        abdomen.hilera_uno.crearSeda();
        abdomen.hilera_dos.crearSeda();

        return "La araña se esta armando una telaraña para vivir";
    }

}
