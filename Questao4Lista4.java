import java.util.Scanner;

public class Questao4Lista4 {

    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main (String[] args) {
        int valor1 = 0;
        int valor2 = 0;

        imprimir("digite o primeiro valor do intevalo");
        valor1 = lerValorInt(valor1);

        imprimir("digite o último valor do intevalo");
        valor2 = lerValorInt2(valor2);

        impressãoNum(valor1, valor2);
    }

    public static int lerValorInt(int valor1) {
        valor1 = tecladoScanner.nextInt();

        return valor1;
    }

    public static int lerValorInt2(int valor2) {
        valor2 = tecladoScanner.nextInt();

        return valor2;
    }

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static void impressãoNum(int valor1, int valor2) {
        int finalResultados = 0;
        String texto = null;

        for(finalResultados = valor1; finalResultados <= valor2; finalResultados = finalResultados + 1) {
            texto = ("toba" + finalResultados);

            imprimir(texto);
        }
    }
}