import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        while (true) {
            System.out.println("Ingrese un número entero A:");
            A = scanner.nextInt();

            System.out.println("Ingrese un número entero B:");
            B = scanner.nextInt();

            if (A < B) {
                break;
            } else {
                System.out.println("A debe ser menor que B. Por favor, ingrese valores nuevamente.");
            }
        }

        System.out.println("Los números pares entre " + A + " y " + B + " son:");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


    }
}
