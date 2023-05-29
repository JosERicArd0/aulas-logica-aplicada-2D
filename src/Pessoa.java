public class Pessoa extends Animal{
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
    public void comer(){ //sobrescrita do método comer

        System.out.println("Pessoa comeu!");
    }
}