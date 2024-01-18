// Dados los valores de dos de los ángulos interiores de un triángulo, la
// computadora muestra el valor del restante.
// Ejemplo: Ingresa 40 y 60, debe devolver 80.

// @Author RoxDev

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer ángulo: ");
        double angulo1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo ángulo: ");
        double angulo2 = scanner.nextDouble();
        double angulo3 = 180 - angulo1 - angulo2;
        System.out.println("El tercer ángulo es " + angulo3 + ".");
    }
}