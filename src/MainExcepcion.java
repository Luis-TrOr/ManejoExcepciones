import java.util.Scanner;

public class MainExcepcion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        double numero = scanner.nextDouble();

        try {
            if (numero < 0) {
                throw new NumeroNegativoExcepcion("No se puede calcular la raiz cuadrada de un numero negativo.");
            } else {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raiz cuadrada de " + numero + " es " + raizCuadrada);
            }

        } catch (NumeroNegativoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
