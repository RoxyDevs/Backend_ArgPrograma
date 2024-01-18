/*
Estructura de repetición controlada por contador
4.1) Dado un entero N entre 1 y 10 (inclusive), la computadora muestra la tabla de
multiplicar de N.

 @Author RoxDev

 */

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un número entero entre 1 y 10: ");
        N = sc.nextInt();
        while (N < 1 || N > 10) {
            System.out.print("El número ingresado no está dentro del rango permitido. Ingrese un número entero entre 1 y 10: ");
            N = sc.nextInt();
        }
        System.out.println("Tabla de multiplicar de " + N + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}