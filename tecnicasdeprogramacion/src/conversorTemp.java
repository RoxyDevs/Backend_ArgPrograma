// Dada una temperatura en grados centígrados, la computadora la muestra en grados Fahrenheit.
//Ejemplo: Ingresa 20, debe devolver 68.

// @Author RoxDev
import java.util.Scanner;

public class conversorTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados centígrados: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("La temperatura en grados Fahrenheit es " + fahrenheit + ".");
    }
}