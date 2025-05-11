import java.util.Scanner;

public class QuestaoAnoBissexto {
    
    final static Scanner tecladoScanner = new Scanner(System.in);
    
    public static void main (String[] args) {
        int ano = 0;
        String resultado = null;

        imprimir("digite o ano");
        ano = lerValorInt();

        resultado = classificarAnoBissexto(ano);
        imprimir("o ano " + ano + " é " + resultado);
    }

    public static void imprimir (String saida) {
        System.out.println(saida);
    }
    public static int lerValorInt() {
        int valor = 0;

        valor = tecladoScanner.nextInt();

        return valor;
    }

    public static String classificarAnoBissexto(int ano) {
        String resultado = null;

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            resultado = "bissexto";
        } else {
            resultado = "não bissexto";
        }

        return resultado;
    }
}