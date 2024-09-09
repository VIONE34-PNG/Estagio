import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero " + numero + " nao pertence a sequencia de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b <= n) {
            if (b == n) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return n == 0;
    }
}