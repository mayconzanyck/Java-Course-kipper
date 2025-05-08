```
//CLASSES: POO, modelo que devine a estrutura do objeto
//CLASSE ABSTRATA: pode definir metodos com ou sem implementação direta, porem nao pode ser estanciada


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


//MODIFICADORES DE ACESSO: controla a visibilidade das classes e metodos
Public: O metodo ou classe é acessivel de qualquer lugar/pacote
Default(Quando nao e definido modificador): Todo mundo que tiver no mesmo pacote da classe, consegue ver ela, mas outras nao conseguem acessar ela de fora
Private: Só vao estar visiveis na classe que foi declarado
Protected: Vai ser visivel dentro do mesmo arquivo, porem nao vai ser visivel para fora (dentro do mesmo pacote)

//INTERFACE: define um contrato que a classe deve seguir, normalmente vai definir os metodos que ela vai ter, sem implementar nada
public interface Carro {

    void acelerar();
    void freiar();
    void parar();
}


//HERANÇA: permite que uma subclasse possa herdar atributos de uma classe mãe


//POLIMORFISMO: permite que uma unica interface(metodo/classe) seja usada para representar diferentes tipos de açoes ou objetos
Obejtos que possuem o mesmo contrato porem tem comportamento diferente


//EXCEÇÕES
NullPointerException
ArrayIndexOfBoundsException
RuntimeExcpetion
IOException
ArithmeticException

Carro meuErroFurado = null;

try{
    meuErroFurado.acelerar();
} catch (NullPointerException exception){
    System.out.println("Vende carro curado");
}
```