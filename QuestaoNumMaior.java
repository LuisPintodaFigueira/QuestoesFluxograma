import java.util.Scanner;

public class QuestaoNumMaior {
    
    final static Scanner tecladoScanner = new Scanner(System.in);

    public static void main (String[] args) {
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        String resultado = null;

        imprimir("digite o primeiro valor");
        valor1 = lerValorDouble();

        imprimir("digite o segundo valor");
        valor2 = lerValorDouble();

        imprimir("digite o terceiro valor");
        valor3 = lerValorDouble();

        resultado = classificarValor(valor1, valor2, valor3);
        imprimir("o valor do número é " + resultado);
    }

    public static void imprimir (String saida) {
        System.out.println(saida);
    }

    public static double lerValorDouble() {
        double valor = 0;

        valor = tecladoScanner.nextDouble();

        return valor;
    }

    public static String classificarValor(double valor1, double valor2, double valor3) {
        String resultado = null;

        if (valor1 > valor2 && valor1 > valor3) {
            resultado = "primeiro";
        } else if (valor2 > valor1 && valor2 > valor3) {
            resultado = "segundo";
        } else if (valor3 > valor1 && valor3 > valor2) {
            resultado = "terceiro";
        } else {
            resultado = "nenhum";
        }

        return resultado;
    }
}
