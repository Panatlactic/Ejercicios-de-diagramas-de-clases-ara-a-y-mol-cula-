package Molecula_pk;

public class Molecula_Agua {

    public Hidrogeno hidrogeno_uno;
    public Hidrogeno hidrogeno_dos;
    public Oxigeno oxigeno;

    public Molecula_Agua() {
        this.hidrogeno_uno = new Hidrogeno();
        this.hidrogeno_dos = new Hidrogeno();
        this.oxigeno = new Oxigeno();
    }

    public void presentar (){
        System.out.println("Esta es una molecula de agua, formada de dos atomos de hidrogeno y uno de oxigeno");
    }

}