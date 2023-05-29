public class Main {
    public static void main(String[] args) {
        Pessoa adao = new Pessoa();

        //declaração
        Pessoa qualquer;

        //instanciação
        qualquer = new Pessoa();

        //definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";

        //Declarar comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));
    }
    }