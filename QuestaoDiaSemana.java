import java.util.Scanner;

public class QuestaoDiaSemana {

    final static Scanner tecladoScanner = new Scanner(System.in);
    
    public static void main (String[] args) {
        int dia = 0;
        String resultado = null;

        imprimir("digite o número do dia da semana");
        dia = lerValorInt();

        resultado = classificarDiaSemana(dia);
        imprimir("o dia da semana é " + resultado);
    }

    public static void imprimir (String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt() {
        int valor = 0;

        valor = tecladoScanner.nextInt();

        return valor;
    }

    public static String classificarDiaSemana(int dia) {
        String resultado = null;

        if (dia == 1) {
            resultado = "domingo";
        } else if (dia == 2) {
            resultado = "segunda-feira";
        } else if (dia == 3) {
            resultado = "terça-feira";
        } else if (dia == 4) {
            resultado = "quarta-feira";
        } else if (dia == 5) {
            resultado = "quinta-feira";
        } else if (dia == 6) {
            resultado = "sexta-feira";
        } else if (dia == 7) {
            resultado = "sábado";
        } else {
            resultado = "invalido";
        }

        return resultado;
    }
}
