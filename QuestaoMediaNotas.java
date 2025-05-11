import java.util.Scanner;

public class QuestaoMediaNotas {
    
    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main (String[] args) {
        float finalMedia = 0;
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        String resultado = null;
        String nomeAluno = null;

        imprimir("digite o nome do aluno");
        nomeAluno = tecladoScanner.nextLine();

        imprimir("digite a primeira nota");
        nota1 = lerValorFloat();

        imprimir("digite a segunda nota");
        nota2 = lerValorFloat();

        imprimir("digite a terceira nota");
        nota3 = lerValorFloat();

        finalMedia = calcularMedia(nota1, nota2, nota3);
        resultado = classficarMedia(finalMedia);

        resultado = classficarMedia(finalMedia);
        imprimir("o aluno " + nomeAluno + " está " + resultado);
    }

    public static float calcularMedia (float nota1, float nota2, float nota3) {
        return (nota1*2 + nota2*3 + nota3*5) /10;
    }

    public static void imprimir (String saida) {
        System.out.println(saida);
    }

    public static float lerValorFloat() {
        float valor = 0;

        valor = tecladoScanner.nextFloat();

        return valor;
    }

    public static String classficarMedia(float finalMedia) {
        String resultado = null;
        String nomeAluno = null;

        if (finalMedia >= 90) {
            resultado = "aprovado com conceito A";
        } else if (finalMedia >= 75) {
            resultado = "aprovado com conceito B";
        } else if (finalMedia >= 60) {
            resultado = "aprovado com conceito C";
        } else if (finalMedia >= 40) {
            resultado = "reprovado com conceito D";
        } else if (finalMedia < 40) {
            resultado = "reprovado com conceito E";
        } else {
            resultado = "o aluno " + nomeAluno + "está " + resultado;
        }

        return resultado;
    }
}