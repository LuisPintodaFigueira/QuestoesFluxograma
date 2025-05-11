import java.util.Scanner;

public class QuestãoAposentadoria {
    
    final static Scanner tecladoScanner = new Scanner(System.in);
    
    public static void main (String[] args) {
        int idade = 0;
        int tempoContribuicao = 0;
        String resultado = null;

        imprimir("digite a idade do trabalhador");
        idade = lerValorInt();

        imprimir("digite o tempo de contribuição do trabalhador");
        tempoContribuicao = lerValorInt();

        resultado = classificarAposentadoria(idade, tempoContribuicao);
        imprimir("o trabalhador está " + resultado);
    }

    public static void imprimir (String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt() {
        int valor = 0;

        valor = tecladoScanner.nextInt();

        return valor;
    }

    public static String classificarAposentadoria(int idade, int tempoContribuicao) {
        String resultado = null;

        if (idade >= 65 && tempoContribuicao >= 30) {
            resultado = "apto para aposentadoria";
        } else if (idade >= 60 && tempoContribuicao >= 25) {
            resultado = "apto para aposentadoria";
        } else if (idade >= 55 && tempoContribuicao >= 20) {
            resultado = "apto para aposentadoria";
        } else {
            resultado = "não apto para aposentadoria";
        }

        return resultado;
    }
}
