import java.util.Scanner;

public class Cadenavacia {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);

            String Cadena = "";

            while (true){
                System.out.println("ingresar una  palabra(vacio para finalizar)");

                String palabra=scanner.nextLine();

                if (palabra.isEmpty()) {
                    break;
                }
                if (!Cadena.isEmpty()){
                    palabra += "";


                }

                Cadena+=palabra;



        }


            System.out.println( Cadena);





}}
