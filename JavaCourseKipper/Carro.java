package JavaCourseKipper;

//INTERFACE: define um contrato que a classe deve seguir, normalmente vai definir os metodos que ela vai ter, sem implementar nada
public interface Carro {

    void acelerar();
    void freiar();
    void parar();
}

//POLIMORFISMO: permite que uma unica interface(metodo/classe) seja usada para representar diferentes tipos de açoes ou objetos
//Obejtos que possuem o mesmo contrato porem tem comportamento diferente