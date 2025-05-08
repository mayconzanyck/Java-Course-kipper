package JavaCourseKipper;

public class Humano extends SerVivo{

    String nome;

    public Humano(){
        //Aciona o construtor da superclasse
        super(18);
        this.nome = "Bianca";
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Inalando e exalando CO2 e Oxigenio");
    }
}