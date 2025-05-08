package JavaCourseKipper;

//CLASSE ABSTRATA: pode definir metodos com ou sem implementação direta, porem nao pode ser estanciada
public abstract class SerVivo {
    protected int idade;

    public SerVivo(int idade){
        this.idade = idade;
    }

    public abstract void respirar();

    public void dormir(){
        System.out.println("Dormindo...");
    }
}
