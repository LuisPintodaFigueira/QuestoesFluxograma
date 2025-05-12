public class QuestaoFibonacci {

    public static void main (String[] args) {
        int n = 20;
        int contador = 0;
        int resultado = 0;

        imprimir ("Fibonacci de " + n + ":");

        while (contador <= n) {
            resultado = fibonacci(contador);
            imprimir (contador + " -> " + resultado);
            contador = contador + 1;
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
         else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void imprimir (String saida) {
        System.out.println(saida);
    }
}
