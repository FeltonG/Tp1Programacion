import java.util.Scanner;

public class leernumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduzca numeros enteros,cero para detener:");

        int numero;

        while (true) {
            System.out.print("ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("programa finalizado.");
                break;
            }


            if (numero > 0) {
                System.out.println("El numero es positivo.");
            } else {
                System.out.println("El numero es negativo.");
            }


            if (numero % 2 == 0) {
                System.out.println("El numero es par.");
            } else {
                System.out.println("El numero es impar.");
            }


        }
}}
