import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un número:");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else {
                long factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }

                System.out.println("El factorial de " + n + " es: " + factorial);
            }
        }
    }


