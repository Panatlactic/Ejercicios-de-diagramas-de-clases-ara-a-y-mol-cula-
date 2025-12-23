package Molecula_pk;

class Molecula_Agua {

    public Hidrogeno hidrogeno_uno;
    public Hidrogeno hidrogeno_dos;
    public Oxigeno oxigeno;

    public Molecula_Agua() {
        this.hidrogeno_uno = new Hidrogeno();
        this.hidrogeno_dos = new Hidrogeno();
        this.oxigeno = new Oxigeno();
    }

}