import java.util.Scanner;

public class QntNumParesImpares {

    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main (String[] args) {
        int valor = 0;
        int qntImpares = 0;
        int qntPares = 0;
        int contador = 0;
        int qntNum = 0;

        contador = contadorParar(contador, qntNum);

        imprimir("digite a quantidade de números desejados ");
        qntNum = lerQntNum(qntNum);

        imprimir("disque um número ");
        valor = lerValorInt(valor);
    }

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static int lerQntNum(int qntNum) {
        qntNum = tecladoScanner.nextInt();

        return qntNum;
    }

    public static int lerValorInt(int valor) {
        valor = tecladoScanner.nextInt();

        return valor;
    }

    public static int quantidadeNumeros(int qntNum) {
        qntNum = tecladoScanner.nextInt();

        return qntNum;
    }

    public static int verificador(int valor, int qntImpares, int qntPares) {
        if (valor %2 == 0) {
            valor = qntPares;
            qntPares = qntPares + 1;
        } else {
            valor = qntImpares;
            qntImpares = qntImpares + 1;
        }

        return 
    }

    public static int contadorParar(int contador, int qntNum) {
        if (contador <= qntNum) {
            contador = contador + 1;
        } else {
            
        }

        return contador;
    }

}