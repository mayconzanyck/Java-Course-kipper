//CLASSES: POO, modelo que devine a estrutura do objeto

public class Main {

    //Metodo de entrada (Main)
    public static void main(String[] args) {

        //Cada um desses representa uma nova estancia da classe carro
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("BMW");
        Carro meuCarro2 = new Carro("Porsche");

        //Chamando METODO
        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
    }
}

//CONSTRUTOR: atribuir variaveis(atributos) ao objeto
class Carro{

    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    //METODO(função)
    public void acelerar(){
        System.out.println("Acelerando o carro " + this.modelo);
    }
}