//PACOTES: organizar em namespaces distintos para evitar conflitos; tem hierarquia de diretorios
package JavaCourseKipper;

//CLASSES: POO, modelo que devine a estrutura do objeto

public class Main {

    //Metodo de entrada (Main)
    public static void main(String[] args) {

        //Cada um desses representa uma nova estancia da classe carro
        Carro meuCarro = new Porsche();
        Carro meuCarro2 = new BMW();

        meuCarro.acelerar();
        meuCarro2.acelerar();

        /*
        Carro meuCarro1 = new Carro("BMW");
        Carro meuCarro2 = new Carro("Fusca");

        //Chamando METODO
        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
        */
    }
}

/*
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
*/

//MODIFICADORES DE ACESSO: controla a visibilidade das classes e metodos
/*
Public: O metodo ou classe é acessivel de qualquer lugar/pacote
Default(Quando nao e definido modificador): Todo mundo que tiver no mesmo pacote da classe, consegue ver ela, mas outras nao conseguem acessar ela de fora
Private: Só vao estar visiveis na classe que foi declarado
Protected: Vai ser visivel dentro do mesmo arquivo, porem nao vai ser visivel para fora (dentro do mesmo pacote)
*/