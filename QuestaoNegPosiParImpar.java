import java.util.Scanner;

public class QuestaoNegPosiParImpar {
     
    final static Scanner tecladoScanner =new Scanner (System.in);

    public static void main (String[] args) {
        int valor = 0;

        imprimir ("digite um valor: ");
        valor = lerValorInt();

        String resultado = finalDoPinto(valor);
        imprimir ("o número é: " + resultado);       
}
    public static void imprimir (String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt() {
        return tecladoScanner.nextInt();
    }

    public static String finalDoPinto(int valor) {
        String resultado = null;
        String resultado2 = null;

        if (valor > 0) {
            resultado = "positivo";
        } else {
            resultado = "negativo";
        } 
        
        if (valor % 2 == 0) {
            resultado2 = "par";
        } else {
            resultado2 = "impar";
        }

        return resultado + " e " + resultado2;

    }      
}
