import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre = sc.nextLine();
        System.out.print("¡Hola " + nombre + "!");
    }
}