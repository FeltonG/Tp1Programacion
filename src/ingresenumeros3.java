import java.util.Scanner;

public class ingresenumeros3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char respuesta;

    do {
        System.out.print("ingrese un número: ");
        int numero = scanner.nextInt();


        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }


        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        System.out.print("queres introducir más números (S/N): ");
        respuesta = scanner.next().charAt(0);

        System.out.println();

    } while (respuesta != 'N' && respuesta != 'n');
    System.out.println("Programa finalizado.");

}
}

