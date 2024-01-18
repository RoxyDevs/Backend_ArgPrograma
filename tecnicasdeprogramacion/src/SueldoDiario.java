// Dados el valor de una hora de trabajo y la cantidad de horas trabajadas por
//día, la computadora muestra el valor del sueldo diario.
//Ejemplo: Ingresa 80 y 8, debe devolver 640.

// @Author RoxDev

import java.util.Scanner;

public class SueldoDiario{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de una hora de trabajo: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Ingresa la cantidad de horas trabajadas por día: ");
        double horasTrabajadas = scanner.nextDouble();
        double sueldoDiario = valorHora * horasTrabajadas;
        System.out.println("El sueldo diario es " + sueldoDiario + ".");
    }
}

