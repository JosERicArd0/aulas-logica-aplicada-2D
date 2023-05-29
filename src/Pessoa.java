public class Pessoa {

    String nome;
    String sobrenome;



    //construtor
    public void falar() {
        System.out.println("falei");
    }
    public String falar(String volume) {return "falei" + volume;}
    Pessoa() {

    }

    Pessoa(String _nome) {
        this.nome = _nome;
    }
}