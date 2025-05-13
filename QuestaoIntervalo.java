import java.util.Scanner;

public class QuestaoIntervalo {
    
    final static Scanner tecladoScanner = new Scanner(System.in); 

    public static void main (String[] args) {
        int valor1 = 0;
        int valor2 = 0;

        imprimir ("digite o primeiro valor do intervalo: ");
        valor1 = lerValorInt();

        imprimir ("digite o segundo valor do intervalo: ");
        valor2 = lerValorInt();

        imprimir("valores do intervalo: ");
        imprimirIntervalo(valor1, valor2);

}

    public static void imprimir (String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt() {
       return tecladoScanner.nextInt();
    }

    public static void imprimirIntervalo(int valor1, int valor2) {
        if (valor1 >= valor2) {
            System.out.println(valor1);
            imprimirIntervalo(valor1 - 1, valor2);
        }
    }      
}
