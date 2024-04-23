import java.util.Scanner;

public class leenumeros2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduzca números enteros. ingrese cero para detener:");

        int numero;

        do {
            System.out.print("ingrese un número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("programa finalizado.");
                break;
            }

            if (numero > 0) {
                System.out.println("el número es positivo.");
            } else {
                System.out.println("el número es negativo.");
            }


            if (numero % 2 == 0) {
                System.out.println("el número es par.");
            } else {
                System.out.println("el número es impar.");
            }

            System.out.println();

        } while (numero != 0);


    }
}

