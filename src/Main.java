import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String lectTeclado = scanner.nextLine();

        try {
            // Invocar al metodo
            char resultado = CaracterEn.caracterEn(lectTeclado, 7);
            System.out.println("El carácter en la posición 7 es: " + resultado);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}