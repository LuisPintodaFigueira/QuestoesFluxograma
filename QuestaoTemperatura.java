import java.util.Scanner;

public class QuestaoTemperatura {

    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt(int temperatura) {
        temperatura = tecladoScanner.nextInt();

        return temperatura;
    }

    public static int quantidadeDias(int contador, int temperatura) {
        do { 
            imprimir("digite a temperatura atual: ");
            lerValorInt(temperatura);
            if (temperatura >= 15 && temperatura <= 37) {
                contador++;
            } else {
                imprimir("digite a temperatura novamente: ");
                // lerValorInt(temperatura);
            }        
        } 
        while (contador <= 10);

        return temperatura;
    }

    public static menorTemp(int temperatura) {
        int menorTemperatura = 0;

        if (temperatura <= temperatura) {
            menorTemperatura = temperatura;
        } else {
            menorTemperatura == menorTemperatura;
        }

        return menorTemperatura;
    }


    public static void imprimir( String[] args) {
        int temperatura = 0;
        int menorTemperatura = 0;

        imprimir("digite a temperatura atual: ");
        lerValorInt(temperatura);

    }
}
