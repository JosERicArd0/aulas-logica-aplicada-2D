public class Animal {
    //atributos - características
    String nome;
    String raça;

    public void andar(){
        //métodos - comportamento
        System.out.println("andou");
    }

    public String falar(String volume){
        return "falei" + volume;
    }

    public void falar() {
        System.out.println("falou");
    }
}
