import java.util.Scanner;

public class Questao6LIsta2 {
     
    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main (String[] args) {
        int valor1 = 0;
        int valor2 = 0;
        int soma = 0;
        String saida = null;

        imprimir("digite o primeiro valor do intervalo");
        valor1 = lerValorInt(valor1);

        imprimir("digite o último valor do intervalo");
        valor2 = lerValorInt2(valor2);

        saida = "a soma de" + valor1 + "e" + valor2 + "é" + calcular()

    }

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt(int valor1) {
        valor1 = tecladoScanner.nextInt();

        return valor1;
    }

    public static int lerValorInt2(int valor2) {
        valor2 = tecladoScanner.nextInt();

        return valor2;
    }

    public static int calcular(int valor1, int valor2, int soma) {

        for (soma = valor1; soma <= valor2; soma = soma + 1) {
            
        }
    }
}
