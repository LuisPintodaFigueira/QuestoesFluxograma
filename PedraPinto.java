import java.util.Scanner;

public class PedraPinto {

    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main(String[] args) {
        int jogador1 = 0;
        int jogador2 = 0;
        int jogada1 = 0;
        int jogada2 = 0;
        String vencedor = null;

        imprimir("leve em consideração que pedra equivale a 0, papel equivale a 1 e tesoura equivale 2");

        imprimir("digite a primeira jogada do jogador 1");
        jogada1 = lerValorInt(jogada1);

        imprimir("digite a segunda jogada do jogador 2");
        jogada2 = lerValorInt2(jogada2);
    }

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt(int jogada1) {
        jogada1 = tecladoScanner.nextInt();

        return jogada1;
    }

    public static int lerValorInt2(int jogada2) {
        jogada2 = tecladoScanner.nextInt();

        return jogada2;
    }

    public static void verificar(int jogada1, int jogada2, int jogador1, int jogador2) {
        while (jogador1 < 3 || jogador2 < 3) {
        if((jogada1 == 0) || (jogada1 == 1) || (jogada1 == 2) || (jogada2 == 0) || (jogada2 == 1) || (jogada1 == 2)) {
            
        }
    }
    }
}