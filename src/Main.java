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
        System.out.println(qualquer.falar(" alto"));

        //Criar mais objetos
        Animal cao = new Animal();
        Animal gato = new Animal();
        Animal gato2 = new Animal();
        Animal roedor;
        roedor =new Animal();
        Animal x;
        x =new Animal();

        //Consultar dados do objeto cao
        cao.nome = "Rufus";
        System.out.println(cao.nome); //consulta
        cao.comer();//chamada de método
        Pessoa nova = new Pessoa();
        nova.nome = "Tina";
        nova.comer();
        }
    }