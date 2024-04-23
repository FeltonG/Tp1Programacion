import java.sql.SQLOutput;
import java.util.Scanner;

public class Mayuscula {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese  un caracter");
        char caracter=scanner.next().charAt(0);

        if (Character.isUpperCase(caracter)){
            System.out.println("el caracter"+ caracter+ " es mayuscula");

        }else {
            System.out.println(caracter  +""+ "no es mayuscula");}
}}
