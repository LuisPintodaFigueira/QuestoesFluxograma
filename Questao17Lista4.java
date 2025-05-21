import java.util.Scanner;

public class Questao17Lista4 {

    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main (String[] args) {
        long graos = 1;
        int graosPorCasas = 0;
        int soma = 0;

        soma = processamento(graos, graosPorCasas);
    }

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static void processamento(long graos,int graosPorCasas) {

        for (graosPorCasas = 1; graosPorCasas <= 64; graosPorCasas = graosPorCasas + 1) {
            int atual = 1;

            atual = atual * 2;

            imprimir(atual);
        }
    }
}