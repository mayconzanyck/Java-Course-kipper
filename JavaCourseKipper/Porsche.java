package JavaCourseKipper;

public class Porsche implements Carro{

    //Final serve para definir valor final
    final int limiteDeVelocidade = 300;

    public int velocidadeAtual = 0;

    //Override: sobreescreve a definição implementando algo
    @Override
    public void acelerar() {
        if(this.velocidadeAtual <= this.limiteDeVelocidade){
            this.velocidadeAtual += 50;
            System.out.println("Acelerando..");
        }
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
