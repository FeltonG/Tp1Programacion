import java.util.Scanner;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" el primer lado del triángulo:");
        int a = scanner.nextInt();

        System.out.println(" el segundo lado del triángulo:");
        int b = scanner.nextInt();

        System.out.println(" el tercer lado del triángulo:");
        int c = scanner.nextInt();

        if (puedeFormarTriángulo(a, b, c)) {
            System.out.println("Los valores pueden formar un triángulo.");
        } else {
            System.out.println("Los valores no pueden formar un triángulo.");
        }

        scanner.close();
    }

    public static boolean puedeFormarTriángulo(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}

