import java.util.Scanner;

public class biblioteca {

    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main(String[] args) {
    int estudantes = 0;
    int qtdVezes = 0;
    int categoria1 = 0;
    int categoria2 = 0;
    int categoria3 = 0;
    int respostas = 0;

    imprimir("digite a quantidade de alunos que utilizaram a biblioteca");
    estudantes = lerValorInt(estudantes);

    processamento(estudantes, qtdVezes, categoria1, categoria2, categoria3, respostas);

    }
    
    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt(int estudantes) {
        estudantes = tecladoScanner.nextInt();

        return estudantes;
    }

    public static int lerValorInt2(int qtdVezes) {
        qtdVezes = tecladoScanner.nextInt();

        return qtdVezes;
    }

    public static void processamento(int estudantes, int qtdVezes, int categoria1, int categoria2, int categoria3, int respostas) {

        while(respostas < estudantes) {

        imprimir("quantas vezes utilizou a biblioteca?");
        qtdVezes = lerValorInt2(qtdVezes);

        respostas++;

        if (respostas <= 5) {
            categoria1++;
        }else if (respostas > 5 && respostas <= 10) {
            categoria2++;
        } else {
            categoria3++;
        }
        }

        imprimir("categoria 1: " + categoria1);
        imprimir("categoria 2: " + categoria2);
        imprimir("categoria 3: " + categoria3);
    }

}
