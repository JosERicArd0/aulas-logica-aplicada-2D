public class Animal {
    //atributos - características
    String nome;
    String raca;
    double peso;
    String tipoPelo;
    String corOlhoDireito;
    public void andar(){
        //métodos - comportamento
        System.out.println("andou!");
    }
    public void comer(){

        System.out.println("Comeu!");
    }
    public String falar(String volume){
        return "falei" + volume;
    }

    public void falar() {
        System.out.println("falou");
    }
}
