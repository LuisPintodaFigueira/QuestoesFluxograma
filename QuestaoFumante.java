import java.util.Scanner;

public class QuestaoFumante {
    
    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main(String[] args) {
        int dias = 0;
        int anosFumados = 0;
        int resultadoMinutos = 0;
        int resultadoDias = 0;
        int resultadoFinal = 0;

        imprimir("por quantos anos você já fumou?");
        anosFumados = lerValorInt(anosFumados);

        imprimir("quantos cigarros você fuma por dia?");
        dias = lerValorInt2(dias);

        calcular(dias, anosFumados, resultadoMinutos, resultadoFinal, resultadoDias);

    }

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt(int anosFumados) {
        anosFumados = tecladoScanner.nextInt();

        return anosFumados;
    }

    public static int lerValorInt2(int dias) {
        dias = tecladoScanner.nextInt();

        return dias;
    }

    public static void calcular(int dias, int anosFumados, int resultadoMinutos, int resultadoFinal, int resultadoDias) {

        resultadoDias = dias * 10;

        resultadoMinutos = anosFumados * 525600;

        resultadoFinal = resultadoMinutos - resultadoDias;

        imprimir("você perdeu da sua vida " + resultadoFinal + "minutos");
    }
}
