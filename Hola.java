import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca su primer apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Introduzca su segundo apellido: ");
        String apellido2 = sc.nextLine();
        System.out.print("Introduzca su numero favorito: ");
        int numero = sc.nextInt();
        System.out.print("¡Hola " + nombre + " " + apellido1 + " " + apellido2 + "!" + "¡El " + numero + " es un número muy interesante!");
    }
}