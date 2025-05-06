import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        //VARIAVEIS
        int minhaIdade = 18;
        String meuNome = "Maycon";

        Ou usando var:
        var nomeVariavel = "Maycon";


        //TIPOS PRIMITIVOS

        numeros inteiros = 100, 583958, 1, 9492
        byte => 8 bits => -128 a 127
        short => 16 bits => -32.768 a 32.767
        int => 32 bits => -2.147.483.648 a 2.147.483.647
        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        numeros decimais = 1.2, 3.4, 7.7
        float => 32 bits => precisao simples (poucos numeros após virgula, 39.23)
        double => 64 bits => precisao dupla (mais numeros após virgula, 67.3295)

        String => representar palavras e frases

        char => representar um unico caractere (em aspas simples) => a, b, c, d

        boolean => true ou false
        */

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Bianca";
        boolean bool = true;

        //CONDICIONAIS
        if(str.isBlank()){ //verifica se é vazio
            System.out.println("Verdadeiro");
        }else if(str == "Bianca"){
            System.out.println("Bianca");
        }
        else{
            System.out.println("Falso");
        }

        //VETORES
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5}; //tem limite fixo(passando o valor para cada posição), nao e possivel fazer com que por exemplo a posição 5 receba 6, pois ali so vai ate a posição 4.
        int[] meusNumeros = new int[7]; //passando o tamanho do vetor
        System.out.println(colecaoDeInteiros[0]);
        System.out.println(meusNumeros.length);

        //ARRAY LISTS (lista dinamica de elementos)
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Bianca");
        nomes.add("Leticia");
        nomes.add("Henrique");
        nomes.add("Maycon");
        nomes.add("Joao");

        //Mostrando nome na posição 1
        System.out.println(nomes.get(1));

        nomes.remove(1);

        //Mostrando novo nome na posição 1 após remover o antigo da posição pela propria posição
        System.out.println(nomes.get(1));

        nomes.remove("Henrique");

        //Mostrando novo nome na posição 1 após remover o antigo da posição pelo proprio nome
        System.out.println(nomes.get(1));
    }
}
