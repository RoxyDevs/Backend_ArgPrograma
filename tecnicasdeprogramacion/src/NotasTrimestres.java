//Dadas 3 notas pertenecientes a tres trimestres distintos, la computadora muestra la nota promedio.
// Ejemplo: Ingresa 3, 8 y 2, debe devolver 4.33333333.

// @Author RoxDev
import java.util.Scanner;

public class NotasTrimestres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la nota del primer trimestre: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingresa la nota del segundo trimestre: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingresa la nota del tercer trimestre: ");
        double nota3 = scanner.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de las tres notas es " + promedio + ".");
    }
}
