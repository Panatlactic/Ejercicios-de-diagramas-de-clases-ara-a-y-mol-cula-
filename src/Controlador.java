import araña_pk.Araña;
import Molecula_pk.Molecula_Agua;

public class Controlador {
    public Controlador (){
    }

    public void iniciarAaraña_Molecula (){
        Araña witsiAraña = new Araña();
        Molecula_Agua molecula_agua = new Molecula_Agua();

        // Molecula
        System.out.println("\n--> Molecula:");
        molecula_agua.presentar();

        // Araña
        System.out.println("\n--> Araña:");
        witsiAraña.morder();
        witsiAraña.dejarDeMorder();
        System.out.println(witsiAraña.crearTelaraña());

    }
}
