//CLASSES: POO, modelo que devine a estrutura do objeto

public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("BMW");
        Carro meuCarro2 = new Carro("Porsche");
    }
}

//CONSTRUTOR: atribuir valores(atributos) ao objeto
class Carro{

    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }
}