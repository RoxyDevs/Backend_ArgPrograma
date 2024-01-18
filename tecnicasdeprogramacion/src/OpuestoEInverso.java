// Ingresar un número y que la computadora muestre su opuesto y su inverso.
// Ejemplo: Ingresa 8, debe devolver -8 y 0.125.

// @Author RoxDev

import java.util.Scanner;

public class OpuestoEInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double num = scanner.nextDouble();
        double op = num * -1;
        double inv = 1 / num;
        System.out.println("El opuesto de " + num + " es: " + op + ".");
        System.out.println("El inverso de " + num + " es: " + inv + ".");
    }
}