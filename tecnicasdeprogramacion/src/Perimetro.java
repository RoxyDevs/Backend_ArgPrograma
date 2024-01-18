// Dada la superficie de un cuadrado (en m2), la computadora muestra su perímetro.
//Ejemplo: Ingresa 81, debe devolver 36.

// @Author RoxDev
import java.util.Scanner;

public class Perimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la superficie del cuadrado (en m²): ");
        double superficie = scanner.nextDouble();
        double lado = Math.sqrt(superficie);
        double perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es " + perimetro + " metros.");
    }
}