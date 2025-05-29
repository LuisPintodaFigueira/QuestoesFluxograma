import java.util.Scanner;

public class QuestaoSucessorAntecessor {

    final static Scanner tecladoScanner = new Scanner (System.in);
    
    public static void main(String[] args) {
        int valor1 = 0;

        imprimir("digite um valor inteiro");
        valor1 = lerValorInt(valor1);

        imprimir("o sucessor de " + valor1 + " é " + (valor1 + 1));
        imprimir("o antecessor de " + valor1 + " é " + (valor1 - 1));


    }

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt(int valor1) {
        valor1 = tecladoScanner.nextInt();

        return valor1;
    }

}
